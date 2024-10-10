package Classwork.Modules.M303_10;

public class PrivateClassExample {
    public static void main(String[] args) {
        InnerPrivateClass ipc = new PrivateClassExample().new InnerPrivateClass();
    }

    //this is to show that the java language will allow an internal private class
    private class InnerPrivateClass {

        private String a;
        private String b;
    }
}
