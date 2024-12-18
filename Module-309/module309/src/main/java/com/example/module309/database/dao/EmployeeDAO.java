package com.example.module309.database.dao;

import com.example.module309.database.entities.Employee;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeDAO {
    @Query("select e from Employee e where e.firstname = :firstName")
    List<Employee> findByFirstName(String firstName);

    Employee findById(Integer id);
}

