public class Perusahaan extends Form {
    KantorBPS kantorBPS;
    String nama;
    Alamat alamat;
    KIP kip;
    String telepon;
    String faksimil;
    BentukBadanHukum bentukBadanHukum;
    DDP ddp;
    Subsektor subsektor;
    JenisUsahaUtama jenisUsahaUtama;

    public Perusahaan() {
    }

    public Perusahaan(KantorBPS kantorBPS, String nama, Alamat alamat, KIP kip, String telepon, String faksimil,
            BentukBadanHukum bentukBadanHukum, DDP ddp, Subsektor subsektor, JenisUsahaUtama jenisUsahaUtama) {
        this.kantorBPS = kantorBPS;
        this.nama = nama;
        this.alamat = alamat;
        this.kip = kip;
        this.telepon = telepon;
        this.faksimil = faksimil;
        this.bentukBadanHukum = bentukBadanHukum;
        this.ddp = ddp;
        this.subsektor = subsektor;
        this.jenisUsahaUtama = jenisUsahaUtama;
    }
    
    public KantorBPS getKantorBPS() {
        return kantorBPS;
    }

    public void setKantorBPS(KantorBPS kantorBPS) {
        this.kantorBPS = kantorBPS;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Alamat getAlamat() {
        return alamat;
    }

    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }

    public KIP getKip() {
        return kip;
    }

    public void setKip(KIP kip) {
        this.kip = kip;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getFaksimil() {
        return faksimil;
    }

    public void setFaksimil(String faksimil) {
        this.faksimil = faksimil;
    }

    public BentukBadanHukum getBentukBadanHukum() {
        return bentukBadanHukum;
    }

    public void setBentukBadanHukum(BentukBadanHukum bentukBadanHukum) {
        this.bentukBadanHukum = bentukBadanHukum;
    }

    public DDP getDdp() {
        return ddp;
    }

    public void setDdp(DDP ddp) {
        this.ddp = ddp;
    }

    public Subsektor getSubsektor() {
        return subsektor;
    }

    public void setSubsektor(Subsektor subsektor) {
        this.subsektor = subsektor;
    }

    public JenisUsahaUtama getJenisUsahaUtama() {
        return jenisUsahaUtama;
    }

    public void setJenisUsahaUtama(JenisUsahaUtama jenisUsahaUtama) {
        this.jenisUsahaUtama = jenisUsahaUtama;
    }

}
