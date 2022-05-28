import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LatihanFile {
    public static void main(String[] args) {
        // File f = new File("D:\\Kuliah\\STIS\\Semester 4\\PBO\\Praktikum\\modul10\\javaio.txt");
        // System.out.println(f.getName());
        // System.out.println(f.getParent());
        // System.out.println(f.canWrite());
        // f.renameTo(new File("D:\\Kuliah\\STIS\\Semester 4\\PBO\\Praktikum\\modul10\\javaio2.txt"));
        // f.delete();
        // FileInputStream fis = null;
        // File f = new File("D:\\Kuliah\\STIS\\Semester 4\\PBO\\Praktikum\\modul10\\textfile.txt");
        // cek isi file
        // try{
        //     fis = new FileInputStream(f);
        //     System.out.println(fis.available());
        //     System.out.println((char)fis.read());
        //     System.out.println(fis.available());
        //     System.out.println((char)fis.read());
        //     System.out.println(fis.available());
        // } catch (FileNotFoundException ex) {
        //     System.out.println("File tidak ditemukan");
        // } catch (IOException ex){
        //     System.out.println("File tidak dapat dibaca");
        // } finally {
        //     try {
        //         fis.close();
        //     } catch (IOException ex) {
        //         Logger.getLogger(LatihanFile.class.getName()).log(Level.SEVERE, null, ex);
        //     }
        // }

        //Membaca isi file

        // try{
        //     fis = new FileInputStream(f);
        //     while(fis.available() > 0){
        //         System.out.print((char)fis.read());
        //     }
        // } catch (FileNotFoundException ex) {
        //     System.out.println("File tidak ditemukan");
        // } catch (IOException ex){
        //     System.out.println("File tidak dapat dibaca");
        // } finally {
        //     try {
        //         fis.close();
        //     } catch (IOException ex) {
        //         Logger.getLogger(LatihanFile.class.getName()).log(Level.SEVERE, null, ex);
        //     }
        // }

        //Menulis file
        // try {
        //     FileOutputStream fos = new FileOutputStream("D:\\Kuliah\\STIS\\Semester 4\\PBO\\Praktikum\\modul10\\javaio.txt");
        //     String str = "Java Input Output";
        //     fos.write(str.getBytes());
        //     fos.close();
        // } catch (FileNotFoundException ex) {
        //     //TODO: handle exception
        //     Logger.getLogger(LatihanFile.class.getName()).log(Level.SEVERE, null, ex);
        // } catch (IOException ex) {
        //     Logger.getLogger(LatihanFile.class.getName()).log(Level.SEVERE, null, ex);
        // }

        // membuat object
        // try {
        //     FileOutputStream fos = new FileOutputStream("D:\\Kuliah\\STIS\\Semester 4\\PBO\\Praktikum\\modul10\\objek.dat");
        //     ObjectOutputStream oos = new ObjectOutputStream(fos);
        //     Mahasiswa mhs = new Mahasiswa();
        //     mhs.setNim("1234");
        //     mhs.setNama("Andi");
        //     oos.writeObject(mhs);
        //     oos.close();
        //     fos.close();
        // } catch (FileNotFoundException ex) {
        //     Logger.getLogger(LatihanFile.class.getName()).log(Level.SEVERE, null, ex);
        // } catch (IOException ex) {
        //     Logger.getLogger(LatihanFile.class.getName()).log(Level.SEVERE, null, ex);
        // }


        //membaca object
        try {
            File f = new File("D:\\Kuliah\\STIS\\Semester 4\\PBO\\Praktikum\\modul10\\objek.dat");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Mahasiswa mhs = (Mahasiswa) ois.readObject();
            System.out.println(mhs.getNim());
            System.out.println(mhs.getNama());
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File tidak ditemukan");
        } catch (IOException ex) {
            System.err.println("File gagal dibaca");
        } catch (ClassNotFoundException ex) {
            System.err.println("Format File salah");
        }
    }
}