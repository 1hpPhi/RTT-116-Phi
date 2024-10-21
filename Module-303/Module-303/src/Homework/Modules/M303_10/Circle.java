package Homework.Modules.M303_10;

import Classwork.Modules.M303_9.Shape;

public class Circle extends Shape implements Movable {
    protected double radius;
    private final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double height) {
        this.radius = radius;
        super.height = height;
    }

    public Circle(int i, int i1, int i2) {
        super();
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public String getCoordinate() {
        return "";
    }

    @Override
    public void setBase(double base) {

    }

    @Override
    public void setWidth(double width) {

    }

    public double getArea() {
        //double area = PI * this.radius * this.radius;
        super.area = PI * Math.pow(this.radius, 2); // initializing value in parent class variable
        return super.area; //reference to  parent class variable
    }
    @Override
    public void displayshapName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() + "]";
    }


    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
