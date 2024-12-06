package org.example.database.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="student_courses")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Student_Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;
}
