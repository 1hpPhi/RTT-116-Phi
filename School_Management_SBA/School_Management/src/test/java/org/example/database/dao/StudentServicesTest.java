package org.example.database.dao;

import org.example.database.entity.Course;
import org.example.database.entity.Student;
import org.example.database.services.CourseService;
import org.example.database.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


public class StudentServicesTest {


    private static CourseService courseService;
    private static Session session;

    @Test
    @Order(1)
    void setUp() {
        session = HibernateUtil.getSessionFactory().openSession();

        courseService = new CourseService();

        Transaction tx = session.beginTransaction();
        try {
            Student student = new Student("test.student@gmail.com", "Test Student", "password1230");

            // Course course = courseService.getCourseByNameAndInstructor("JUnit Testing", "Joe Doe");
            //    if (course == null) {
            //        course = new Course("JUnit Testing", "Joe Doe");
            //        courseService.createCourse(course);
            //    }
            //
            //    if (!student.getCourses().contains(course)) {
            //        student.getCourses().add(course);
            //        session.saveOrUpdate(student);
            //    }

            Course course;

            String courseName = "JUnit Testing";
            String instructor = "Joe Doe";
            Course existingCourse = courseService.getCourseByNameAndInstructor(courseName, instructor);


            if (existingCourse == null) {
                course = new Course(courseName, instructor);
                courseService.createCourse(course);
            } else {
                course = existingCourse;
            }

            if (!student.getCourses().contains(course)) {
                student.getCourses().add(course);
                session.saveOrUpdate(student);
            }

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
// drop create to remove dupes in database
