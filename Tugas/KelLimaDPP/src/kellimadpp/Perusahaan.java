package kellimadpp;
/**
 * Anggota Kelompok 5 2KS3:
 * Pandya Almastiana Alifka 222011620
 * Moch. Daffa' AlFaris     222011622
 * Rahmad Setiya Budi       222011623
 * Amanda Christina Saragih 222011650
 * Nur Aini Adilah          222011676
 */

public class Perusahaan extends Form {
    KantorBPS kantorBPS;
    String nama;
    Alamat alamat;
    KIP kip;
    String telepon;
    String faksimil;
    BentukBadanHukum bentukBadanHukum;
    DPP dpp;
    Subsektor subsektor;
    JenisUsahaUtama jenisUsahaUtama;

    public Perusahaan() {
    }

    public Perusahaan(KantorBPS kantorBPS, String nama, Alamat alamat, KIP kip, String telepon, String faksimil,
            BentukBadanHukum bentukBadanHukum, DPP dpp, Subsektor subsektor, JenisUsahaUtama jenisUsahaUtama) {
        this.kantorBPS = kantorBPS;
        this.nama = nama;
        this.alamat = alamat;
        this.kip = kip;
        this.telepon = telepon;
        this.faksimil = faksimil;
        this.bentukBadanHukum = bentukBadanHukum;
        this.dpp = dpp;
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

    public DPP getDpp() {
        return dpp;
    }

    public void setDdp(DPP dpp) {
        this.dpp = dpp;
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
    
    public String toString(){
        return 
       ("==UPDATING DIREKTORI PERUSAHAAN PERTANIAN BERBADAN HUKUM==\n"+
        "\nRAHASIA" 
        + "\nProvinsi      : "+kantorBPS.getNamaJelasProv()+"  ("+kantorBPS.getKodeProv()+")"
        + "\nKabupaten/Kota: "+kantorBPS.getNamaJelasKab()+"  ("+kantorBPS.getKodeKab()+")"
        + "\nPeriode Data  : "+kantorBPS.getNamaJelasPeriodeData()+"  ("+kantorBPS.getKodePeriodeData()+")"
        + "\n\n#KIP"
        + "\nKode Prov.                 : "+kip.getKodeProv()
        + "\nKode Kab.                  : "+kip.getKodeKab()
        + "\nKode Kec.                  : "+kip.getKodeKec()
        + "\nKode KJU.                  : "+kip.getKodeKJU()
        + "\nNo. Urut dalam satu kab/kot: "+kip.getNoUrut()
        + "\n\nNama Perusahaan Pertanian   : "+nama
        + "\nAlamat Perusahaan Peretanian: "+alamat
        + "\nNomor Telepon               : "+telepon              
        + "\nNomor Faksimili             : "+faksimil
        + "\n\n#Pencacahan dengan Kuesioner Rutin/DPP"
        + "\nKolom 12                    : "+dpp.getKolom12()
        + "\nKolom 13                    : "+dpp.getKolom13()
        + "\n\n#Subsektor"
        + "\nTanaman Pangan              : "+subsektor.getTanamanPangan()
        + "\nHortikultura                : "+subsektor.getHoltikultura()
        + "\nPerkebunan                  : "+subsektor.getPerkebunan()
        + "\nPeternakan                  : "+subsektor.getPeternakan()
        + "\nKehutanan                   : "+subsektor.getKehutanan()
        + "\nPerikanan                   : "+subsektor.getPerikanan()
        + "\n\nJenis Usaha Utama           : "+jenisUsahaUtama
         );
    }

}