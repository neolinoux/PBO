package registration_form;

/**
 *
 * @author Dell
 */
public class Mahasiswa {
    // atribut
    String nim;
    String nama;
    String umur;
    String asal;
 
    // konstruktor
    Mahasiswa(String nim, String nama, String umur, String asal){
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
        this.asal = asal;
    }
     
    // method untuk menampilkan object Mahasiswa 
    void print(){
        System.out.println(this.nim+"-"+this.nama);
    }
     
}
