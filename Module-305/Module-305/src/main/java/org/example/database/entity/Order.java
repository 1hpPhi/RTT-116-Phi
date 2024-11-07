package org.example.database.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name ="orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Order {

    //@Id tells hibernate that this is a primary key for this entity
    @Id
    //this tells hibernate that the database will auto increment the new id for a new record in the database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "order_date", columnDefinition = "DATE")
    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @Column(name = "required_date", columnDefinition = "DATE")
    @Temporal(TemporalType.DATE)
    private Date requiredDate;

    @Column(name = "shipped_date", columnDefinition = "DATE")
    @Temporal(TemporalType.DATE)
    private Date shippedDate;

    @Column(name = "status")
    private String status;

    @Column(name = "comments", columnDefinition = "TEXT")
    private String comments;
}
