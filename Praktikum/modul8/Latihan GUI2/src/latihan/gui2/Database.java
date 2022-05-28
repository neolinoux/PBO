/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package latihan.gui2;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// *
// * @author Tyo
// */
//public class Database implements Serializable{
//    public static Database instance;
//    private ArrayList<Mahasiswa> data = new ArrayList<>();
//    private Database(){
//    }
//
//    public static synchronized Database getInstance() {
//        loadFile();
//        if(instance == null){
//            instance = new Database();
//        }
//        return instance;
//    }
//
//    public void insertMahasiswa(Mahasiswa mahasiswa){
//        data.add(mahasiswa);
//        updateFile();
//    }
//
//    public List<Mahasiswa> getListMahasiswa() {
//        return data;
//    }
//    
//    private static void loadFile() {
//        //load file
//        try {
//            File f = new File("D:\\Kuliah\\STIS\\Semester 4\\PBO\\Praktikum\\modul8\\Latihan GUI2\\database.dat");
//            FileInputStream fis = new FileInputStream(f);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            instance = (Database) ois.readObject();
//            ois.close();
//            fis.close();
//        } catch (FileNotFoundException ex) {
//            System.err.println("File tidak ditemukan");
//        } catch (ClassNotFoundException ex) {
//            System.err.println("Format File salah");
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//            System.err.println("Gagal membaca file");
//        }
//    }
//    
//    private void updateFile() {
//        try {
//            FileOutputStream fos = new FileOutputStream("D:\\Kuliah\\STIS\\Semester 4\\PBO\\Praktikum\\modul8\\Latihan GUI2\\database.dat");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(instance);
//            oos.close();
//            fos.close();
//        } catch (FileNotFoundException ex) {
//            System.err.println("File tidak ditemukan");
//        } catch (IOException ex) {
//            System.err.println("Gagal menulis file");
//        }
//    }
//}


/*
* Click

nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-
default.txt to change this license

* Click
nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to
edit this template
*/
package latihan.gui2;
import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;
import java.sql.*;
import java.util.Arrays;
/**
*
* @author User
*/
public class Database implements Serializable{
    public static Database instance;
    private final String DB_TYPE = "mysql";
    private final String DB_HOST = "localhost";
    private final String DB_PORT = "3306";
    private final String DB_NAME = "pbo";
    private final String DB_USER = "root";
    private final String DB_PASS = "";
    
    private Database(){
    }

    public static synchronized Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }

    public void insertMahasiswa(Mahasiswa mahasiswa) throws SQLException{
        Connection conn = getConnection();
        try{
            String sql="INSERT INTO mahasiswa VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mahasiswa.getNim());
            pstmt.setString(2, mahasiswa.getNama());
            pstmt.setString(3, mahasiswa.getJenisKelamin());
            pstmt.setInt(4, mahasiswa.getUmur());
            pstmt.setString(5, mahasiswa.getAlamat());
            pstmt.setString(6, mahasiswa.getProvinsi());
            pstmt.setString(7, String.join(",",mahasiswa.getHobi()));
            pstmt.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn!=null){
                conn.close();
            }
        }
    }

    public List<Mahasiswa> getListMahasiswa() throws SQLException{
        List<Mahasiswa> mhsList = new ArrayList<>();
        Connection conn = getConnection();
        try{
            String sql = "SELECT * FROM mahasiswa";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setJenisKelamin(rs.getString("jenis_kelamin"));
                mhs.setUmur(rs.getInt("umur"));
                mhs.setAlamat(rs.getString("alamat"));
                mhs.setProvinsi(rs.getString("provinsi"));
                mhs.setHobi(new
                ArrayList<>(Arrays.asList(rs.getString("hobi").split(","))));
                mhsList.add(mhs);
            }
        }catch(SQLException ex){
            throw ex;
        } finally{
            if (conn!=null){
                conn.close();
            }
        }
        return mhsList;
    }
    
    public void editMahasiswa(Mahasiswa mahasiswa, String nim) throws SQLException{
        Connection conn = getConnection();
        try{
//            String sql="UPDATE mahasiswa SET nama = '" + mahasiswa.getNama() + "' WHERE nim = '"+ nim +"'";
            String sql="UPDATE mahasiswa SET nama = ?, jenis_kelamin = ?, umur = ?, alamat = ?, provinsi = ?, hobi = ?"
                    + "WHERE nim = '"+ nim +"'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mahasiswa.getNama());
            pstmt.setString(2, mahasiswa.getJenisKelamin());
            pstmt.setInt(3, mahasiswa.getUmur());
            pstmt.setString(4, mahasiswa.getAlamat());
            pstmt.setString(5, mahasiswa.getProvinsi());
            pstmt.setString(6, String.join(",",mahasiswa.getHobi()));
            pstmt.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
    public void hapusMahasiswa(Mahasiswa mahasiswa, String nim) throws SQLException{
        Connection conn = getConnection();
        try{
//            String sql="UPDATE mahasiswa SET nama = '" + mahasiswa.getNama() + "' WHERE nim = '"+ nim +"'";
            String sql="DELETE FROM mahasiswa WHERE nim = '"+ nim +"'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:"+DB_TYPE+"://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME,DB_USER,DB_PASS);
    }
}