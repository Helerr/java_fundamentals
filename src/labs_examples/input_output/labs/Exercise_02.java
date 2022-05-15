package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 * <p>
 * -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 * -For example, change every 'a' to '-' and every 'e' to '~' .
 * -Make sure you close the connections to both files.
 * <p>
 * Then, read back the encrypted file using the BufferedReader and
 * print out the unencrypted version. Does it match the original file?
 */

class Read {
    public static void main(String[] args) {
        String fileIn = "src/labs_examples/input_output/labs/exercise2.txt";
        String fileOut = "src/labs_examples/input_output/labs/exercise2-encoded.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileIn)); BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut))) {
            String str;

            while ((str = reader.readLine()) != null){
                if (str.contains("a")) {
                    str = str.replace("a", "-");
                }
                if (str.contains("e")) {
                    str = str.replace("e", "~");
                }
                //System.out.println(str);
                writer.write(str);
                writer.write("\r");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileOut))) {
            String str;

            while ((str = reader.readLine()) != null){
                if (str.contains("-")) {
                    str = str.replace("-", "a");
                }
                if (str.contains("~")) {
                    str = str.replace("~", "e");
                }
                System.out.println(str);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}


