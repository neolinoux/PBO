package kellimadpp;
/**
 * Anggota Kelompok 5 2KS3:
 * Pandya Almastiana Alifka 222011620
 * Moch. Daffa' AlFaris     222011622
 * Rahmad Setiya Budi       222011623
 * Amanda Christina Saragih 222011650
 * Nur Aini Adilah          222011676
 */

public class Alamat {
    public String provinsi;
    public String kabupatenKota;
    public String kecamatan;
    public String kelurahan;
    public String namaJalan;
    public String kodePos;

    public Alamat(){

    }

    public Alamat(String provinsi, String kabupatenKota, String kecamatan, String kelurahan, String namaJalan, String kodePos) {
        this.provinsi = provinsi;
        this.kabupatenKota = kabupatenKota;
        this.kecamatan = kecamatan;
        this.kelurahan = kelurahan;
        this.namaJalan = namaJalan;
        this.kodePos = kodePos;
    }
    
    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKabupatenKota() {
        return kabupatenKota;
    }

    public void setKabupatenKota(String kabupatenKota) {
        this.kabupatenKota = kabupatenKota;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getNamaJalan() {
        return namaJalan;
    }

    public void setNamaJalan(String namaJalan) {
        this.namaJalan = namaJalan;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }
    
    public String toString(){
        return(getNamaJalan()+", "+getKelurahan()+", "+getKecamatan()+", "
               +getKabupatenKota()+", "+getProvinsi()+", "+ getKodePos());
    }
}