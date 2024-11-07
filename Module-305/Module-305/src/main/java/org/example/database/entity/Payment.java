package org.example.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name ="payments")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Payment {

    //@Id tells hibernate that this is a primary key for this entity
    @Id
    //this tells hibernate that the database will auto increment the new id for a new record in the database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "check_number")
    private String checkNumber;

    @Column(name = "payment_date", columnDefinition = "Date")
    @Temporal(TemporalType.DATE)
    private Date paymentDate;

    @Column(name = "amount", columnDefinition = "DECIMAL")
    private Double amount;
}
