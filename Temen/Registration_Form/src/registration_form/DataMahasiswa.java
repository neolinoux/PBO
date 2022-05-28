package registration_form;

/**
 *
 * @author Dell
 */
import java.util.ArrayList;
 
public class DataMahasiswa {
    // atribut untuk menyimpan data-data mahasiswa
    ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<Mahasiswa>();
     
    // menambahkan data mahasiswa baru ke dalam array list
    void tambahMahasiswa(Mahasiswa data){
        this.dataMahasiswa.add(data);
    }
     
    // menghapus data mahasiswa dengan nim tertentu dari array list
    //void hapusMahasiswa(String nim){}
     
    // mencari data mahasiswa dengan nim tertentu dari array list
    //void cariMahasiswa(String nim){}
     
    // menampilkan seluruh data mahasiswa yang tersimpan dalam array list
    void tampilMahasiswa(){
        System.out.println("-----------------");
        for(Mahasiswa mhs: this.dataMahasiswa){
            mhs.print();
        }
    }
}
