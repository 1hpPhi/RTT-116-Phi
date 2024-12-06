package org.example.database.services;

import org.example.database.dao.CourseI;
import org.example.database.entity.Course;
import org.example.database.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class CourseService implements CourseI {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public CourseService() {
    }

    public void createCourse(Course course) {

        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(course);
            tx.commit();
            System.out.println("Course created successfully: " + course.getName());
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
                e.printStackTrace();
            }
        } finally {
            session.close();
        }
    }

    public List<Course> getAllCourses() {

        Session session = factory.openSession();
        Transaction tx = null;
        List<Course> courses = new ArrayList<Course>();

        try {
            tx = session.beginTransaction();

            String hql = "FROM Course";
            courses = session.createQuery(hql, Course.class).getResultList();

            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
                e.printStackTrace();
            }
        } finally {
            session.close();
        }
        return courses;
    }

    public Course getCourseById(int courseId) {
        Session session = factory.openSession();
        Transaction tx = null;
        Course course = null;

        try {
            tx = session.beginTransaction();
            course = (Course) session.get(Course.class, courseId);
            if (course == null) {
                System.out.println("No courses found with ID: " + courseId);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
                e.printStackTrace();
            }
        } finally {
            session.close();
        }
        return course;
    }

    public Course getCourseByName(String courseName) {
        Transaction tx = null;
        Course course = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();

            // Use HQL to find the course by name
            course = session.createQuery("FROM Course WHERE name = :courseName", Course.class)
                    .setParameter("courseName", courseName)
                    .uniqueResult();

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
        return course;
    }

    public void deleteCourse(Integer courseId) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();

            Course course = session.get(Course.class, courseId);
            if (course != null) {
                session.delete(course);
                System.out.println("Deleted course with ID: " + courseId);
            } else {
                System.out.println("No course found with ID: " + courseId);
            }

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    public Course getCourseByNameAndInstructor(String name, String instructor) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Course WHERE name = :name AND instructor = :instructor", Course.class)
                    .setParameter("name", name)
                    .setParameter("instructor", instructor)
                    .uniqueResult();
        }
    }
}
