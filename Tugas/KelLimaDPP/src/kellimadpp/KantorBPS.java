package kellimadpp;

/**
 * Anggota Kelompok 5 2KS3:
 * Pandya Almastiana Alifka 222011620
 * Moch. Daffa' AlFaris     222011622
 * Rahmad Setiya Budi       222011623
 * Amanda Christina Saragih 222011650
 * Nur Aini Adilah          222011676
 */

public class KantorBPS {
    private String namaJelasProv;
    private String kodeProv;
    private String namaJelasKab;
    private String kodeKab;
    private String namaJelasPeriodeData;
    private String kodePeriodeData;

    public KantorBPS(){
        
    }
    
    public KantorBPS(String namaJelasProv, String kodeProv, String namaJelasKab,String kodeKab, String namaJelasPeriodeData, String kodePeriodeData){
        this.namaJelasProv = namaJelasProv;
        this.kodeProv = kodeProv;
        this.namaJelasKab = namaJelasKab;
        this.kodeKab = kodeKab;
        this.namaJelasPeriodeData= namaJelasPeriodeData;
    }
    
    public String getNamaJelasProv() {
        return namaJelasProv;
    }

    public void setNamaJelasProv(String namaJelasProv) {
        this.namaJelasProv = namaJelasProv;
    }

    public String getKodeProv() {
        return kodeProv;
    }

    public void setKodeProv(String kodeProv) {
        this.kodeProv = kodeProv;
    }

    public String getNamaJelasKab() {
        return namaJelasKab;
    }

    public void setNamaJelasKab(String namaJelasKab) {
        this.namaJelasKab = namaJelasKab;
    }

    public String getKodeKab() {
        return kodeKab;
    }

    public void setKodeKab(String kodeKab) {
        this.kodeKab = kodeKab;
    }

    public String getNamaJelasPeriodeData() {
        return namaJelasPeriodeData;
    }

    public void setNamaJelasPeriodeData(String namaJelasPeriodeData) {
        this.namaJelasPeriodeData = namaJelasPeriodeData;
    }

    public String getKodePeriodeData() {
        return kodePeriodeData;
    }

    public void setKodePeriodeData(String kodePeriodeData) {
        this.kodePeriodeData = kodePeriodeData;
    }   
}