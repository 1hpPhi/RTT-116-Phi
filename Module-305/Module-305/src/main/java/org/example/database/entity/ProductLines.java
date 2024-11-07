package org.example.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="productlines")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProductLines {

    //@Id tells hibernate that this is a primary key for this entity
    @Id
    //this tells hibernate that the database will auto increment the new id for a new record in the database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "product_line")
    private String productLine;

    @Column(name = "description")
    private String description;
}
