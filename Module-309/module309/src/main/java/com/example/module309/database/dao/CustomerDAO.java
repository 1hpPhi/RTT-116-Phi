package com.example.module309.database.dao;

import com.example.module309.database.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Long> {

    @Query("select c from  Customer c where c.contactFirstname = :firstName")
    List<Customer> findByFirstName(String firstName);

    List<Customer> findByContactLastname(String lastName);
}
