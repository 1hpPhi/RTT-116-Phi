package org.example.database.dao;

import org.example.database.entity.Course;

import java.util.List;

public interface CourseI {
    void createCourse(Course course);
    List<Course> getAllCourses();
    Course getCourseById(int courseId);
}
