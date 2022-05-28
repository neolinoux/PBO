import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Tyo
 */
public class Mahasiswa implements Serializable{
    private String nim,nama,jenisKelamin;
    private int umur;
    private String alamat, provinsi;
    private ArrayList<String> hobi;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public ArrayList<String> getHobi() {
        return hobi;
    }

    public void setHobi(ArrayList<String> hobi) {
        this.hobi = hobi;
    }
    
}
