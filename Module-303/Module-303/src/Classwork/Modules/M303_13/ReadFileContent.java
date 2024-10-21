package Classwork.Modules.M303_13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class ReadFileContent {

    public static void main(String[] args) {

        File file = new File("Module-303/src/temp.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
                str = br.readLine();
            }
        } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }


