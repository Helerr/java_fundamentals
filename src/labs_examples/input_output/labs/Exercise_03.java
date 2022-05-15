package labs_examples.input_output.labs;

import labs_examples.input_output.examples.BufferedByteStream;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */
class ReadFile{
    public static void main(String[] args) {
        BufferedInputStream input = null;
        InputStreamReader reader = null;
        BufferedOutputStream output = null;
        OutputStreamWriter write = null;
        String filePath = "src/labs_examples/input_output/labs/exercise3-out.txt";
        String filePathOutput = "src/labs_examples/input_output/labs/exercise3-out.txt";

//        try {
//            input = new BufferedInputStream(new FileInputStream(filePath));
//            output = new BufferedOutputStream(new FileOutputStream(filePathOutput));
//            int c;
//            byte[] buffer = new byte[5];
//            while ((c = input.read(buffer)) != -1){
//                output.write(buffer);
//            }
//        } catch (IOException exception){
//            System.out.println("I/O Error: " + exception);
//        } finally {
//            try {
//                assert input != null;
//                input.close();
//                assert output != null;
//                output.close();
//            } catch (IOException e){
//                System.out.println("Closing exception " + e);
//            }
//        }

        try (DataInputStream dataReader = new DataInputStream(new FileInputStream(filePath)); DataOutputStream dataWriter = new DataOutputStream(new FileOutputStream(filePathOutput))){
            dataWriter.writeInt(37);
            dataWriter.writeDouble(54.323);
            dataWriter.writeBoolean(true);

            System.out.println(dataReader.readInt());
            System.out.println(dataReader.readDouble());
            System.out.println(dataReader.readBoolean());
        } catch (IOException exc){
            System.out.println("I/O Error: " + exc);
        }

    }

}