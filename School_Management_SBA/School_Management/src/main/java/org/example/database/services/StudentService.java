package org.example.database.services;

import org.example.database.dao.StudentI;
import org.example.database.entity.Course;
import org.example.database.entity.Student;
import org.example.database.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements StudentI {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public StudentService() {
    }

    public void createStudent(Student student) {
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(student);
            tx.commit();
            System.out.println("Student created successfully: " + student.getName());
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
                e.printStackTrace();
            }
        } finally {
            session.close();
        }
    }

    public List<Student> getAllStudents() {

        List<Student> students = new ArrayList<Student>();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            students = session.createQuery("FROM Student", Student.class).list();
            session.getTransaction().commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
                e.printStackTrace();
            }
        } finally {
            session.close();
        }
        return students;
    }

    public Student getStudentByEmail (String email) {

        Session session = factory.openSession();
        Transaction tx = null;
        Student student = null;

        try {
            tx = session.beginTransaction();

            String hql = "FROM Student WHERE email = :email";
            student = (Student) session.createQuery(hql).setParameter("email", email).uniqueResult();
            session.getTransaction().commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
                e.printStackTrace();
            }
        } finally {
            session.close();
        }
        return student;
    }

    public boolean validateStudent(String email, String password) {
        Session session = factory.openSession();
        Transaction tx = null;
        boolean isValid = false;

        try {
            tx = session.beginTransaction();

            String hql = "FROM Student WHERE email = :email AND password = :password";
            Student student = (Student) session.createQuery(hql)
                    .setParameter("email", email)
                    .setParameter("password", password)
                    .uniqueResult();

            if (student != null) {
                isValid = true;
                System.out.println("Validation successful");
            } else {
                System.out.println("Invalid email or password");
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
        return isValid;
    }

    public void registerStudentToCourse(String email, int courseId) {
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            Student student = session.createQuery("FROM Student WHERE email = :email", Student.class).setParameter("email", email).uniqueResult();
            Course course = session.get(Course.class, courseId);

            if (student == null) {
                System.out.println("No students found with email: " + email);
            } else if (course == null) {
                System.out.println("No course found with ID: " + courseId);
            } else {

                //double check this later
                if (student.getCourses().contains(course)) {
                    System.out.println("Student already registered for the course: " + course.getName());
                } else {
                    student.getCourses().add(course);
                    session.update(student);
                    System.out.println("Student " + student.getName() + " registered for course " + course.getName());
                }
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
    }

    public List<Course> getStudentCourses(String email) {
        Session session = factory.openSession();
        Transaction tx = null;
        List<Course> courses = new ArrayList<>();

        try {
            tx = session.beginTransaction();

            String sql = "SELECT * FROM courses c " + "JOIN student_courses sc ON c.id  = sc.course_id " + "JOIN students s ON sc.student_id = s.id " + "WHERE s.email = :email";

            courses = session.createNativeQuery(sql, Course.class).setParameter("email", email).getResultList();

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

    public void deleteStudent(Integer studentId) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();

            Student student = session.get(Student.class, studentId);
            if (student != null) {
                session.delete(student);
                System.out.println("Deleted student with ID: " + studentId);
            } else {
                System.out.println("No student found with ID: " + studentId);
            }

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
}
