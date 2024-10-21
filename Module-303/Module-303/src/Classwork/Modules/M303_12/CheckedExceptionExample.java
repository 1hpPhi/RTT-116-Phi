package Classwork.Modules.M303_12;

public class CheckedExceptionExample {

    public void start() throws CustomException{
        method1();
    }

    public void method1() throws CustomException {
        System.out.println("method1");
        method2();
    }



    public void method2() throws CustomException {
        System.out.println("method2");
        throw new CustomException("Error in method 2.");
    }

    public static void main(String[] args) throws CustomException {

        CheckedExceptionExample cee = new CheckedExceptionExample();
        cee.start();
    }
}
