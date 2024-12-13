package com.example.module309.database.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="orderdetails")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderDetail {

    //@Id tells hibernate that this is a primary key for this entity
    @Id
    //this tells hibernate that the database will auto increment the new id for a new record in the database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "order_id")
    private int orderId;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "quantity_ordered")
    private int quantityOrdered;

    @Column(name = "price_each", columnDefinition = "DECIMAL")
    private double priceEach;

    @Column(name = "order_line_number", columnDefinition = "SMALLINT")
    private int orderLineNumber;

    public void setOrder(Order o) {
    }

    public void setProduct(Product p) {
    }
}
