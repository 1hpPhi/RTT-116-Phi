package Homework.Modules.M303_11;

import java.util.ArrayList;

public class GLab_303_11_3 {

    private  int number;
    private  String name;
    private String author;
    private  String category;
    // Constructor with arguments
    public GLab_303_11_3(int number, String name, String author, String category)
    {
        this.name = name;
        this.category = category;
        this.author = author;
        this.number = number;
    }
    // Constructor without arguments
    public GLab_303_11_3()
    {

    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name1) {
        this.name = name1;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public class AddDataToArrayList {
        public  ArrayList<GLab_303_11_3> bookdetails() {
            //User-defined class objects in Java ArrayList

            ArrayList<GLab_303_11_3> list = new ArrayList<GLab_303_11_3>();
            // Passing data using Constructors
            GLab_303_11_3 b1 = new GLab_303_11_3(1, "Death note", "John", "cartoon");
            GLab_303_11_3 b2 = new GLab_303_11_3(2, "Stranger Things", "brothers", "suspense");
            GLab_303_11_3 b3 = new GLab_303_11_3(3, "Spider man", "Alex", "Kids");
            GLab_303_11_3 b4 = new GLab_303_11_3(4, "GentleMen", "Max", "Action");
            // Passing data using setter
            GLab_303_11_3 b5 = new GLab_303_11_3();
            b5.setNumber(5);
            b5.setName("Java FullStack");
            b5.setAuthor("Flex");
            b5.setCategory("Programming");
            // Adding Books objects to Arraylist
            list.add(b1);
            list.add(b2);
            list.add(b3);
            list.add(b4);
            list.add(b5);
            return list;

            /*public class showData {
            //public static void main(String[] args) {
            // instantioation to class AddDataToArrayList
            AddDataToArrayList b = new AddDataToArrayList();
            ArrayList<GLab_303_11_3> mybooklist = b.bookdetails();
            for (GLab_303_11_3 showValue : mybooklist) {
                // ---- invoking getter method for geting Data---------
                System.out.println(showValue.getNumber() + " " + showValue.getName() + " " + showValue.getCategory() + " " + showValue.getAuthor());
            }*/
        }
    }
}

