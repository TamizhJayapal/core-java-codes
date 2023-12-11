import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
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
import java.io.StringBufferInputStream;
import java.util.Scanner;

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
    public static void byteInput() {

        byte[] byteArray = { 65, 66, 67, 68, 70 };
        ByteArrayInputStream baStream = new ByteArrayInputStream(byteArray);

        int input = baStream.read();

        while (input != -1) {
            System.out.print((char) input);
            input = baStream.read();
        }

    }

    @SuppressWarnings("deprecation")
    public static void stringBufferStream() {
        String data = "Hello, World!";
        try (StringBufferInputStream inputStream = new StringBufferInputStream(data)) {
            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                System.out.println((char) byteRead);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
        }
    }

    public static void inputStreamReader() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a line of text: ");
        try {
            String line = reader.readLine();
            System.out.println("You entered: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void audioStream()
            throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file = new File("C:\\Users\\jtamizhazhagan\\Documents\\audios\\sample_audio.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);

        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        // Start playing the audio
        clip.start();

        // Sleep for a while to allow the audio to play
        Thread.sleep(clip.getMicrosecondLength() / 1000);

        // Close the Clip and AudioInputStream when done
        clip.close();
        audioInputStream.close();
    }

    public static void objectReadWrite() throws IOException, ClassNotFoundException {

        File obj = new File("C:/Users/jtamizhazhagan/Documents/for_file/test.txt");
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

    public static void readRawData() {
        File obj = new File("C:/Users/jtamizhazhagan/Documents/for_file/test.txt");
        try {

            // OutputStream outputStream = new FileOutputStream(obj);
            // DataOutputStream doStream = new DataOutputStream(outputStream);
            //
            // doStream.writeInt(44);
            // doStream.writeDouble(44.23);
            // doStream.writeBoolean(true);
            // doStream.close();
            ////
            ////
            // InputStream inputStream = new FileInputStream(obj);
            // DataInputStream diStream = new DataInputStream(inputStream);
            // int intVal = diStream.readInt();
            // double doubleVal = diStream.readDouble();
            // boolean booleanVal = diStream.readBoolean();
            ////
            // System.out.println(intVal);
            // System.out.println(doubleVal);
            // System.out.println(booleanVal);
            //

            OutputStream outputStream1 = new FileOutputStream(obj);

            byte[] byteArr = new byte[] { 72, 101, 108, 108, 111 };
            outputStream1.write(byteArr);

            InputStream inputStream1 = new FileInputStream(obj);
            int input = inputStream1.read();
            while (input != -1) {
                System.out.print((char) input);
                input = inputStream1.read();
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

public class FileHandlingExample {

    public FileHandlingExample() {
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, UnsupportedAudioFileException,
            LineUnavailableException, InterruptedException {

       // ByteStream.audioStream();
        
        // Stream - sequence of data

        // InputStream - read
        // OutputStreeam - write

        // FileInput/OuStream
        // ObjectInputStream
        // ByteArrayInputStream
        // AudioInputStream
        // FilterInputStream
        // DataInputStream

        // File obj = new File("C:/Users/jtamizhazhagan/Documents/for_file/test.txt");
        //
        // try {
        // //File Writing part
        // FileWriter fileWriter = new FileWriter(obj, true);
        // BufferedWriter bWriter = new BufferedWriter(fileWriter);
        //
        // bWriter.write("Hi Hello How Are you!");
        // bWriter.newLine();
        // bWriter.flush();
        // bWriter.close();
        //
        // //File Reading part
        // FileReader fileReader = new FileReader(obj);
        // BufferedReader bReader = new BufferedReader(fileReader);
        //
        // String output = bReader.readLine();
        // while(output != null) {
        // System.out.println(output);
        // output = bReader.readLine();
        // }
        //
        //
        //
        // } catch(FileNotFoundException e) {
        // e.printStackTrace();
        // } catch(IOException e) {
        // e.printStackTrace();
        // }

        // Step 1: File / FileWriter and its methods.

        File obj = new File("/Users/tamizhazhaganjayapal/Documents/core-java-codes/my_files");
        
        String[] filesString = obj.list();
        for (String file : filesString) {
            System.out.println(file);
        }

        File[] files = obj.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }

        // canExecute
        // canRead
        // canWrite

        // if(obj.exists()) {
        // if(obj.canRead()) {
        // System.out.println(obj.getName());
        // }
        //
        // }else {
        // System.out.println("not exist");
        // obj.createNewFile();
        // }

        // FileWriter writer = new FileWriter(obj);
        //
        ////
        // writer.write(78);
        // writer.write("Hi Hello How Are You!");
        //
        // writer.flush();
        // writer.close();
        ////
        // FileReader reader = new FileReader(obj);
        ////
        //// System.out.println(file.length());
        //// char[] ch = new char[(int)file.length()];
        // int output = reader.read();
        ////
        //// for(char ch1: ch) {
        //// System.out.print(ch1);
        //// }
        // while(output != -1) {
        // System.out.print((char)output);
        // output = reader.read();
        // }

    }

}
