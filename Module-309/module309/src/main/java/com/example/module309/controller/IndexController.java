package com.example.module309.controller;

import com.example.module309.database.dao.CustomerDAO;
import com.example.module309.database.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private CustomerDAO customerDAO;

    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView response = new ModelAndView();

        // this is our index.jsp
        response.setViewName("index");

        List<Customer> firstNames = customerDAO.findByFirstName("Alexander");
        for (Customer c : firstNames) {
            System.out.println(c.toString());
        }

        response.addObject("names", firstNames);

        return response;
    }
}
