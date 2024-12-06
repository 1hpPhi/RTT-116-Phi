package org.example.database.dao;

import org.example.database.entity.Course;
import org.example.database.entity.Student;

import java.util.List;

public interface StudentI {
    void createStudent(Student student);
    Student getStudentByEmail(String email);
    boolean validateStudent(String email, String password);
    void registerStudentToCourse(String email, int courseId);
    List<Course> getStudentCourses(String email);
}
