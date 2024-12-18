package com.example.module309.database.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    //@Id tells hibernate that this is a primary key for this entity
    @Id
    //this tells hibernate that the database will auto increment the new id for a new record in the database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Customer> customers;

    @Column(name = "office_id")
    private int officeId;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "extension")
    private String extension;

    @Column(name = "email")
    private String email;

    @Column(name = "reports_to")
    private int reportsTo;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "vacation_hours")
    private int vacationHours;

    @Column(name = "profile_image_url")
    private String profileImageUrl;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", customers=" + customers +
                ", officeId=" + officeId +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", extension='" + extension + '\'' +
                ", email='" + email + '\'' +
                ", reportsTo=" + reportsTo +
                ", jobTitle='" + jobTitle + '\'' +
                ", vacationHours=" + vacationHours +
                ", profileImageUrl='" + profileImageUrl + '\'' +
                '}';
    }
}
