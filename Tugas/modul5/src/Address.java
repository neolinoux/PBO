public class Address{
    public String provinsi;
    public String kabupatenKota;
    public String kecamatan;
    public String kelurahan;
    public String namaJalan;
    public String kodePos;

    public Address() {
        super();
    }
    
    public Address(String provinsi, String kabupatenKota, String kecamatan, String kelurahan, String namaJalan,String kodePos) {
        super();
        this.provinsi = provinsi;
        this.kabupatenKota = kabupatenKota;
        this.kecamatan = kecamatan;
        this.kelurahan = kelurahan;
        this.namaJalan = namaJalan;
        this.kodePos = kodePos;
    }
}
