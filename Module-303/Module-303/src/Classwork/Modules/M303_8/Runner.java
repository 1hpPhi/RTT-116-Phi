package Classwork.Modules.M303_8;

public class Runner {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        System.out.println("The area is " + r1.calculateArea());
        System.out.println("The perimeter is " + r1.calculatePerimeter());

        r1.setHeight(30);
        r1.setWidth(15);
        //Can't call r1.notAvailable since it's private in Rectangle.java

        //Works since it's in the same package
        r1.partlyAvailable();
        
        System.out.println(r1.toString());
        System.out.println("The area is " + r1.calculateArea());
        System.out.println("The perimeter is " + r1.calculatePerimeter());


        Rectangle s2 = new Rectangle(10, 20);
        System.out.println(s2.toString());
        System.out.println("The area is " + s2.calculateArea());
        System.out.println("The perimeter is " + s2.calculatePerimeter());
    }
}