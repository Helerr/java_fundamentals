package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {

        String filePathIn = "src/labs_examples/input_output/labs/exercise1.txt";
        String filePathOut = "src/labs_examples/input_output/labs/exercise1-out.txt";

        try (BufferedInputStream inputStream= new BufferedInputStream(new FileInputStream(filePathIn)); BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(filePathOut))){
            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = inputStream.read(buffer)) != -1){
                outputStream.write(buffer, 0 ,buffer.length);
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}