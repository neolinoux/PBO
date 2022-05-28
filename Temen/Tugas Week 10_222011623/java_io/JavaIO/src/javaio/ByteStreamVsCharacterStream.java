package javaio;
import java.io.*;
public class ByteStreamVsCharacterStream {
    public static void main (String args[]) throws IOException {
        //Byte Based
        InputStream in = null; OutputStream out = null;        
        //Character Based
        Reader reader = null;  Writer writer = null;        
        try {
            // relative to the project directory 
            // Byte Based (FileInputOutputStream)
            in = new FileInputStream("build/classes/javaio/inputFileStream.txt");
            out = new FileOutputStream("build/classes/javaio/outputFileStream.txt");
            // Character Based (ReaderWriter)
            reader = new FileReader("build/classes/javaio/inputReader.txt");
            writer = new FileWriter("build/classes/javaio/outputWriter.txt");
            // Read- Byte Based 
            System.out.println("Read-ByteBased");
            int byt;
            while ((byt=in.read()) != -1) {
                System.out.println(Integer.toBinaryString(byt)+"-"+byt+"-"+(char)byt);
                out.write(byt);
                // Manipulasi
                out.write((char)95); // _          
            }
            
            // Read-Char Based
            System.out.println("Read-CharacterBased");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.println(Integer.toBinaryString(ch)+"-"+ch+"-"+(char)ch);
                writer.write(ch);            
                // Manipulasi
                writer.write((char)95); // _
            }
        } catch (IOException e)  {System.out.println(e);} 
        finally {
            if (in != null || reader != null) {
                in.close();
                reader.close();
            }
            if (out != null || writer != null) {
                out.close();
                writer.close();
            }
        }
    }    
}
