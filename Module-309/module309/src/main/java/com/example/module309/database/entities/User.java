package com.example.module309.database.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {

    //@Id tells hibernate that this is a primary key for this entity
    @Id
    //this tells hibernate that the database will auto increment the new id for a new record in the database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "full_name")
    private String fullName;
}
