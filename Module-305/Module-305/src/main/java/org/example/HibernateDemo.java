package org.example;

import org.example.database.dao.ProductDAO;
import org.example.database.entity.Product;

import java.util.List;

public class HibernateDemo {
    public static void main(String[] args) {

        ProductDAO productDAO = new ProductDAO();
        Product p = productDAO.findById(1);
        System.out.println(p);

        List<Product> fords = productDAO.search("Ford");
        for (Product ford : fords) {
            System.out.println(ford);
        }
    }

}
