package Homework.Modules.M303_10;

public interface Movable {
    void moveUp();    // "public" and "abstract" by default
    void moveDown();
    void moveLeft();
    void moveRight();
    String getCoordinate();

    void setBase(double base);

    void setWidth(double width);

    double getArea();

    //Overriding method of base class with different implementation
    void displayshapName();
}
