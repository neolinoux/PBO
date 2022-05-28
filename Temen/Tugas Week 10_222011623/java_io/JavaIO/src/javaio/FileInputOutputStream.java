package javaio;
import java.io.*;
public class FileInputOutputStream {
    public static void main (String args[]) throws IOException {
        InputStream in = null;
        OutputStream out = null;        
        try {
            // relative to the project directory بسم
            in = new FileInputStream("build/classes/javaio/input.txt");
            out = new FileOutputStream("build/classes/javaio/output.txt");
            int b;
            while ((b=in.read()) != -1) {
                System.out.println(Integer.toBinaryString(b)+"-"+b+"-"+(char)b);
                out.write(b);
                out.write((char)95); // add "_"          
            } 
        } catch (IOException e)  {System.out.println(e);} 
        finally {
            if (in != null ) {
                in.close();
            }
            if (out != null ) {
                out.close();
            }
        }
    }    
}
