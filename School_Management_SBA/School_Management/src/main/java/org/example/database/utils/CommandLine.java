package org.example.database.utils;

import org.example.database.entity.Course;
import org.example.database.entity.Student;
import org.example.database.services.CourseService;
import org.example.database.services.StudentService;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CommandLine {

    private CommandLine(){
    }
    private static final String PASSWORD = "password";

    public static void addData(){

        Session session = HibernateUtil.getSessionFactory().openSession();
        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        Transaction tx = null;

        try {

            tx = session.beginTransaction();

            studentService.createStudent(new Student("reema@gmail.com", "reema brown", PASSWORD));
            studentService.createStudent(new Student("annette@gmail.com", "annette allen", PASSWORD));
            studentService.createStudent(new Student("anthony@gmail.com", "anthony gallegos", PASSWORD));
            studentService.createStudent(new Student("ariadna@gmail.com", "ariadna ramirez", PASSWORD));
            studentService.createStudent(new Student("bolaji@gmail.com", "bolaji saibu", PASSWORD));
            studentService.createStudent(new Student("shirese@gmail.com", "shirese smith", PASSWORD));

            courseService.createCourse(new Course("Java", "Roger Boaitey"));
            courseService.createCourse(new Course("Frontend", "William Roales"));
            courseService.createCourse(new Course("JPA", "Jafer Alhaboubi"));
            courseService.createCourse(new Course("Spring Framework", "LaTonya Lewis"));
            courseService.createCourse(new Course("SQL", "Ezra Williams"));
            courseService.createCourse(new Course("GitHub", "Igor Adulyan"));
            courseService.createCourse(new Course("Web Services", "Raheem Abolfathzadeh"));
            courseService.createCourse(new Course("Microservices", "Eric Heilig"));

            tx.commit();
            System.out.println("Data added successfully!");
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }
}
