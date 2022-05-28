package javaio;
import java.io.*;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException
    {
        // attach inputReader.txt to FileReader obj (fr)
        FileReader fr = new FileReader("build/classes/javaio/inputReader.txt");
        // create outputWriter.txt and attach it to FileWriter obj (fw)
        FileWriter fw = new FileWriter("build/classes/javaio/outputWriter.txt");
        try {                
            // read character from inputReader.txt, write to outputWriter.txt
            int character;
            while( (character = fr.read()) != -1 ) {
                System.out.println((char) character +"="+ character );
                //write and manipulate add "-"
                fw.write(character);
                fw.write("-");
            }
            //close the file
        } catch (IOException ioe) { System.out.println(ioe);}
        finally  {
            if (fw != null || fr != null) {
                fr.close();
                fw.close();
            }
        }
    }
}
    

