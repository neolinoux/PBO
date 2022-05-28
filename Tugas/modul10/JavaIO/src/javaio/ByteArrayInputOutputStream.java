package javaio;
import java.io.*;
class ByteArrayInputOutputStream {
    public static void main(String[] args) throws IOException
    {
        // Creating a Input Stream here Usually it comes from files, programs ب
        ByteArrayInputStream inputByteStream 
                = new ByteArrayInputStream("PبOLSTAT_STIS".getBytes());
        ByteArrayOutputStream outputByteStream = null;            
        OutputStream outputFileStream = null;
        // Taking the InputStream data into a byte array
        byte[] byteArray = null;
        //System.out.println(inputByteStream.readAllBytes()[0]);
        //inputByteStream.reset();
        byteArray = inputByteStream.readAllBytes();
        try { 
            outputFileStream = new FileOutputStream("build/classes/javaio/ByteFileOutput.txt");
            outputByteStream = new ByteArrayOutputStream();  
            for (byte b : byteArray) {
                // Printing the content of byte array in console!
                System.out.println(b+"-"+(char)b);
                outputByteStream.write(b);
                // manipulate
                outputByteStream.write("-".getBytes());                
            }
            // write all contents from outputByteStream
            outputByteStream.writeTo(outputFileStream);
            //outputByteStream.reset();
        } catch (IOException e) { System.out.println(e); }
        finally {
            inputByteStream.close();
            outputByteStream.close();
            outputFileStream.close();
            
        }
    }
}
