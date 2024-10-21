package Classwork.Modules.M303_9;

public abstract class Shape implements AreaCalculation {

    protected double area;
    protected double height;
    private String name;


    public abstract double calculatePerimeter();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
