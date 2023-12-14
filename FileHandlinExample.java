import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

class MyClass implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;

    MyClass(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

}

class ByteStream {
    public static void objectReadWrite() throws IOException, ClassNotFoundException {
        File obj = new File("/Users/tamizhazhaganjayapal/Documents/core-java-codes/my_files/test.txt"); // file path
        if (!obj.exists()) {
            obj.createNewFile();
        }

        MyClass myClass = new MyClass(12);

        FileOutputStream fileOutputStream = new FileOutputStream(obj);
        ObjectOutputStream objOutputStream = new ObjectOutputStream(fileOutputStream);
        objOutputStream.writeObject(myClass);
        objOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(obj);
        ObjectInputStream objInputStream = new ObjectInputStream(fileInputStream);
        Object obj2 = objInputStream.readObject();
        MyClass obj3 = (MyClass) obj2;
        System.out.println(obj3.getId());
    }

    public static void byteArrayInputOutput() {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            byteArrayOutputStream.write("Hello, ".getBytes());
            byte[] byteArray = byteArrayOutputStream.toByteArray();

            // String result = new String(byteArray);
            // System.out.println(result);

            ByteArrayInputStream baStream = new ByteArrayInputStream(byteArray);

            int input = baStream.read();
            while (input != -1) {
                System.out.print((char) input);
                input = baStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void audioStream()
            throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file = new File("/Users/tamizhazhaganjayapal/Documents/core-java-codes/my_files/sample_audio.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);

        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();

        Thread.sleep(clip.getMicrosecondLength() / 1000);
        
        clip.close();
        audioInputStream.close();
    }

     public static void readRawData() {
        File obj = new File("/Users/tamizhazhaganjayapal/Documents/core-java-codes/my_files/test.txt");
        try {
            OutputStream outputStream = new FileOutputStream(obj);
            DataOutputStream doStream = new DataOutputStream(outputStream);
            
            doStream.writeInt(44);
            doStream.writeDouble(44.23);
            doStream.writeBoolean(true);
            doStream.close();
        
            InputStream inputStream = new FileInputStream(obj);
            DataInputStream diStream = new DataInputStream(inputStream);
            int intVal = diStream.readInt();
            double doubleVal = diStream.readDouble();
            boolean booleanVal = diStream.readBoolean();
            
            System.out.println(intVal);
            System.out.println(doubleVal);
            System.out.println(booleanVal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // @SuppressWarnings("deprecation")
    // public static void stringBufferStream() {
    // String data = "Hello, World!";
    // try (StringBufferInputStream inputStream = new StringBufferInputStream(data))
    // {
    // int byteRead;
    // while ((byteRead = inputStream.read()) != -1) {
    // System.out.println((char) byteRead);
    // }
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // }

    // public static void inputStreamReader() {
    //     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //     System.out.println("Enter a line of text: ");
    //     try {
    //         String line = reader.readLine();
    //         System.out.println("You entered: " + line);
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }

    // }
   
}

public class FileHandlingExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException, UnsupportedAudioFileException,
            LineUnavailableException, InterruptedException {
        //-------- char stream (unicode conversion) vs byte stream (byte by byte(8 bits))---------//
        // ------ Type 1: File / FileWriter and its methods. -------
        // Read and write stream of character data

        // File obj = new
        // File("/Users/tamizhazhaganjayapal/Documents/core-java-codes/my_files"); //
        // folder path

        // list all file and folder names
        // String[] filesString = obj.list();
        // for (String file : filesString) {
        // System.out.println(file);
        // }

        // getting filse details as file array
        // File[] files = obj.listFiles();
        // for (File file : files) {
        // if (file.isFile()) {
        // System.out.println(file.getName());
        // }
        // }

        // File("/Users/tamizhazhaganjayapal/Documents/core-java-codes/my_files/test.txt");
        // // file path

        // exists
        // if (!obj.exists()) {
        // System.out.println("file not exists");
        // obj.createNewFile();
        // }

        // length
        // System.out.println(obj.length());

        // can write
        // can execute
        // can read
        // if (obj.canWrite()) {
        // // writing data to file
        // FileWriter writer = new FileWriter(obj);
        // writer.write(78);
        // writer.write("Hi Hello How Are You!");
        // writer.flush();
        // writer.close();
        // }

        // if (obj.canRead()) {
        // // reading the file data
        // FileReader reader = new FileReader(obj);
        // int output = reader.read();
        // while (output != -1) {
        // output = reader.read();
        // System.out.print((char) output);
        // }
        // }

        // ------ Type 2: Buffered Read and Write ------
        // read and write line by line (stream of char data)

        // File obj = new File("C:/Users/jtamizhazhagan/Documents/for_file/test.txt");
        // //file path

        // try {
        // // File Writing part
        // FileWriter fileWriter = new FileWriter(obj, true);
        // BufferedWriter bWriter = new BufferedWriter(fileWriter);

        // bWriter.write("Hi Hello How Are you!");
        // bWriter.newLine();
        // bWriter.flush();
        // bWriter.close();

        // // File Reading part
        // FileReader fileReader = new FileReader(obj);
        // BufferedReader bReader = new BufferedReader(fileReader);

        // String output = bReader.readLine();
        // while (output != null) {
        // System.out.println(output);
        // output = bReader.readLine();
        // }
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // -------- Type 3 Input stream and ouput stream ------------
        // To read write stream binary/raw byte(8 bit) data and character data

        // Stream - sequence of data
        // InputStream - read
        // OutputStreeam - write

        // ------ FileInput/OutputStream ------

        // //writing

        // File obj = new
        // File("/Users/tamizhazhaganjayapal/Documents/core-java-codes/my_files/test.txt");
        // // file path

        // FileOutputStream fileOutputStream = new FileOutputStream(obj);
        // fileOutputStream.write("hi hello".getBytes());
        // fileOutputStream.flush();
        // fileOutputStream.close();

        // // reading
        // FileInputStream fileInputStream = new FileInputStream(obj);
        // int input = fileInputStream.read();
        // while (input != -1) {
        // System.out.print((char)input);
        // input = fileInputStream.read();
        // }

        // writing

        // FileOutputStream fileOutputStream = new FileOutputStream(obj, true);
        // BufferedOutputStream bufferedOutputStream = new
        // BufferedOutputStream(fileOutputStream);
        // bufferedOutputStream.write("hi buddy".getBytes());
        // bufferedOutputStream.flush();
        // bufferedOutputStream.close();

        // //reading
        // FileInputStream fileInputStream = new FileInputStream(obj);
        // BufferedInputStream bufferedInputStream = new
        // BufferedInputStream(fileInputStream);
        // int input = bufferedInputStream.read();
        // while (input != -1) {
        // System.out.print((char)input);
        // input = fileInputStream.read();
        // }

        //ObjectInputStream 

        // ByteStream.objectReadWrite();

        // ByteArrayInputStream
        //ByteStream.byteArrayInputOutput();

        // AudioInputStream
        //ByteStream.audioStream();

        // DataInputStream
         ByteStream.readRawData();
    }
}
