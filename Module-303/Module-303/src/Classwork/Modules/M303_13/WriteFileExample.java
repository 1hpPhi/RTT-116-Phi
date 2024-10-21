package Classwork.Modules.M303_13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteFileExample {

    public static void main(String[] args) {



        File file = new File("Module-303/src/temp1.txt");

        BufferedWriter bw = null;

        try {
            //true = append, false = overwrite
            bw = new BufferedWriter(new FileWriter(file,true));

            bw.write("line 1\n");
            bw.write("line 2\n");
            bw.write("line 3\n");



            bw.flush(); //Write buffer to file

            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (Exception e){

                }
            }
        }
    }
}
