package org.example.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="products")
@AllArgsConstructor
@NoArgsConstructor
//@Data = the following 3
@Getter
@Setter
@ToString
public class Product {

    //@Id tells hibernate that this is a primary key for this entity
    @Id
    //this tells hibernate that the database will auto increment the new id for a new record in the database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "productline_id")
    private int productLineId;

    @Column(name = "product_scale")
    private String productScale;

    @Column(name = "product_vendor")
    private String productVendor;

    @Column(name = "product_description", columnDefinition = "TEXT")
    private String productDescription;

    @Column(name = "quantity_in_stock", columnDefinition = "SMALLINT")
    private int quantityInStock;

    @Column(name = "buy_price", columnDefinition = "DECIMAL")
    private double buyPrice;

    @Column(name = "msrp", columnDefinition = "DECIMAL")
    private double msrp;
}
