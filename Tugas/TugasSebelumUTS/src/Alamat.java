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

}