package javaio;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class BufferedWriterExample {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("testout.txt");
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write("Welcome to javaTpoint.");
            buffer.close();
            System.out.println("Success");
        } catch (IOException ex) {
            Logger.getLogger(BufferedWriterExample.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(BufferedWriterExample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
