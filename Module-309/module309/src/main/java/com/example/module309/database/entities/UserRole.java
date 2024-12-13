package com.example.module309.database.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="user_roles")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserRole {

    //@Id tells hibernate that this is a primary key for this entity
    @Id
    //this tells hibernate that the database will auto increment the new id for a new record in the database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "role_name")
    private String roleName;
}
