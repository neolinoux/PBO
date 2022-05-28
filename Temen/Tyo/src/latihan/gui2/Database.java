/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.gui2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author Tyo
 */
public class Database implements Serializable {

    public static Database instance;
    private ArrayList<Mahasiswa> data = new ArrayList<>();

    private Database() {
    }

    public static synchronized Database getInstance() {
        loadFile();
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void insertMahasiswa(Mahasiswa mahasiswa) {
        data.add(mahasiswa);
        updateFile();
    }

    public List<Mahasiswa> getListMahasiswa() {
        return data;
    }

    private static void loadFile() {
        //load file
        try {
            File f = new File("C:/Users/ASUS/OneDrive - UGM 365/Documents/NetBeansProjects/Tyo/database.dat");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance = (Database) ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File tidak ditemukan");
        } catch (ClassNotFoundException ex) {
            System.err.println("Format File salah");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.err.println("Gagal membaca file");
        }
    }

    private void updateFile() {
        try {
            FileOutputStream fos = new FileOutputStream("C:/Users/ASUS/OneDrive - UGM 365/Documents/NetBeansProjects/Tyo/database.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File tidak ditemukan");
        } catch (IOException ex) {
            System.err.println("Gagal menulis file");
        }
    }
}
