package Classwork.Modules.M303_9;

import java.util.List;
import java.util.ArrayList;

public class CalcRunner {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(10.0);
        c.setName("Circle");

        Circle c1 = new Circle();
        c1.setRadius(15.0);
        c1.setName("Circle 1");

        Triangle t = new Triangle();
        t.setHeight(10.0);
        t.setBase(10.0);
        t.setName("Triangle");

        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(c);
        shapes.add(c1);
        shapes.add(t);

        for (Shape s : shapes) {
            double area =  s.calculateArea();
            System.out.println("The area for shape " + s.getName() + " is " + area);
        }
    }
}
