package Homework.Modules.M303_13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class GLab_303_13_2 {

    public static void main(String[] args) throws IOException
    {
        // initializing two files in Array;
        String[] inputFiles = {"C:/Downloads/file1.txt",
                "C:/Downloads/file2.txt"};

        // Specify out file with path location
//Files contents will be written in these files
        String outputFile = "C:/Downloads/nioOutput.txt";

        // Get Channel for destination or outputFile
        FileOutputStream fos = new FileOutputStream(outputFile);
        FileChannel targetChannel =  fos.getChannel();

        for(int i =0; i < inputFiles.length; i++)
        {
            // Get channel for inputFiles
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputchannel =  fis.getChannel();
            long size = inputchannel.size();
            ByteBuffer buf = ByteBuffer.allocate((int)size);
            System.out.print((char) buf.get());
            while (inputchannel.read(buf)> 0) {
                buf.flip();
                while (buf.hasRemaining()) {
                    //  System.out.print((char) buf.get());
                    targetChannel.write(buf);
                }
            }

        }
        String[] inputFile = {"C:/Downloads/file1.txt", "C:/Downloads/file2.txt"};

        //Files contents will be written in these files
        String outputFiles = "C:/Downloads/OutputExampleTwo.txt";
        //Get channel for output file

        FileOutputStream fo = new FileOutputStream(outputFiles);
        WritableByteChannel targetChannels = fo.getChannel();
        for (int i = 0; i < inputFile.length; i++)
        {
            //Get channel for input files
            FileInputStream fis = new FileInputStream(inputFile[i]);
            FileChannel inputChannel = fis.getChannel();

            //Transfer data from input channel to output channel
            inputChannel.transferTo(0, inputChannel.size(), targetChannels);

            //close the input channel
            inputChannel.close();
            fis.close();
        }

        //finally close the target channel
        targetChannels.close();
        fos.close();
    }
}

