package Classwork.Modules.M303_8;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle() {

    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public String toString() {
        return "Square [height=" + height + ", width=" + width + "]";
    }

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return (2 * width) + (2 * height);
    }

    private void notAvailable() {

    }

    protected void partlyAvailable() {
        //available for things in the same package
    }
}
