package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

public class JDBCExample {

    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {
        String dburl = "jdbc:mysql://localhost:3306/classic_models";
        String user = "root";
        File mySecretFile = new File("C:/Users/1hpPhi/Desktop/Test.txt");
        Scanner myScanner = new Scanner(mySecretFile);
        String password = myScanner.nextLine();
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dburl, user, password);
            String SelectSQL = "Select * FROM employees";
            //String selectSQL = "Select*FROM employees where id = ?";
            //PreparedStatement stmt = connection.prepareStatement(selectSQL;
            //stmt.setInt(1,1056);
            Statement stmt = connection.createStatement();
            ResultSet result =  stmt.executeQuery(SelectSQL);
            while(result.next())
            {
                String EmployeeID  = result.getString("id");
                String fname = result.getString("firstname");
                String lname  = result.getString("lastname");
                System.out.println(EmployeeID +" | " + fname + "|"+ lname );
            }
            connection.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
