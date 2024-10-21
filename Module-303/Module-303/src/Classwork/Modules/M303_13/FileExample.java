package Classwork.Modules.M303_13;

import java.io.File;

public class FileExample {

    public static void main(String[] args) {

        File file = new File("src");
        System.out.println(file.getAbsolutePath());
        System.out.println("Is Directory: " + file.isDirectory());
        System.out.println("Is Hidden: " + file.isHidden());

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                System.out.println("-------> " + f.getName());
            }
        }
    }
}
