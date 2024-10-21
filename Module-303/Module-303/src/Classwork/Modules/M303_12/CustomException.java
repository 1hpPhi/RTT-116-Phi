package Classwork.Modules.M303_12;

public class CustomException extends Exception {

    //extends exception
    //we create a constructor that takes a string and calls super to initialize the parent
    public CustomException(String message) {
        super(message);
    }
}
