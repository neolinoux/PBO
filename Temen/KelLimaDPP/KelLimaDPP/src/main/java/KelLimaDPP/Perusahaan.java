/*
Kelompok 05
1. Akhir Mubarok	            222011698
2. Avelia Deavy Putri Primadani	222011655
3. I Made Satria Ambara Putra	222011635
4. Mohammad Fikri Syams	        222011546
5. Randi Qodri .P	            222011549
*/
package KelLimaDPP;
import java.util.Scanner;

public class Perusahaan{
    private String nama, alamat, telp, faksimili,usahaUtama;
    private int badanHukum;
    private KIP kip;
    private DPP dppPerusahaan;
    private Subsektor subsektorPerusahaan;
    private static String arrUsahaUtama[] = {"1","2","3a","3b","3c","3d","3e","3f","3g","3h","3i","3j","3k","4","5","6","7a","7b","7c","7d"};


    public static String[] getArrUsahaUtama(){
        return Perusahaan.arrUsahaUtama;
    }


    //Mendapatkan Keterangan Usaha Utama seperti yang tertera di Form
    public String getKetUsahaUtama(){
        String str = "";
        switch(this.usahaUtama){
            case "1" :
                str = "Padi/Palawija";
                break;
            case "2" :
                str = "Hortikultura";
                break;
            case "3a" :
                str = "Perkebunan Kakao/Cokelat";
                break;
            case "3b" :
                str = "Perkebunan Karet";
                break;
            case "3c" :
                str = "Perkebunan Kelapa Sawit";
                break;
            case "3d" :
                str = "Perkebunan Kopi";
                break;
            case "3e" :
                str = "Perkebunan Teh";
                break;
            case "3f" :
                str = "Perkebunan Tebu";
                break;
            case "3g" :
                str = "Perkebunan Tembakau";
                break;
            case "3h" :
                str = "Perkebunan Cengkeh";
                break;
            case "3i" :
                str = "Perkebunan Kelapa";
                break;
            case "3j" :
                str = "Perkebunan Lada";
                break;
            case "3k" :
                str = "Tanaman Perkebunan lainnya";
                break;
            case "4" :
                str = "HPH/IUPHHK-HA";
                break;
            case "5" :
                str = "HPHT/IUHHK-HT/Perhutani/Kehutanan lainnya";
                break;
            case "6" :
                str = "Penangkaran STL";
                break;
            case "7a" :
                str = "Budidaya Udang";
                break;
            case "7b" :
                str = "Budidaya Bandeng";
                break;
            case "7c" :
                str = "Budidaya Ikan lainnya di Tambak";
                break;
            case "7d" :
                str = "Budidaya Ikan di Laut";
                break;
            case "7e" :
                str = "Budidaya Ikan di Air Tawar";
                break;
            case "7f" :
                str = "Budidaya Pembenihan";
                break;
            case "8" :
                str = "Penangkapan Ikan";
                break;
            case "9" :
                str = "Ternak Sapi Perah";
                break;
            case "10" :
                str = "Ternak Besar/Kecil";
                break;
            case "11" :
                str = "Unggas";
                break;
            default :
                str = "Tidak terdaftar";
                break;
        }
        return str;
    }
    //Keterangan Badan Hukum dengan Inputan 1-10
    public String getKetBadanHukum(){
        String str = "";
        switch(this.badanHukum){
            case 1 :
                str = "Perusahaan Negara (PN)";
                break;
            case 2 :
                str = "Perusahaan Daerah (PD)";
                break;
            case 3 :
                str = "Persero";
                break;
            case 4 :
                str = "Perum";
                break;
            case 5 :
                str = "Perseroan Terbatas (PT)";
                break;
            case 6 :
                str = "Naamloze Vennootschap (NV)";
                break;
            case 7 :
                str = "Commanditaire Venootschap (CV)";
                break;
            case 8 :
                str = "Firma";
                break;
            case 9 :
                str = "Koperasi/KUD";
                break;
            case 10 :
                str = "Yayasan";
                break;
            default :
                str = "Tidak terdaftar";
                break;
        }
        return str;
    }
    //Constructor Perusahaan
    public Perusahaan() {
        KIP kip = new KIP();
        DPP dpp = new DPP();
        Subsektor ss = new Subsektor();
        this.kip = kip;
        this.dppPerusahaan = dpp;
        this.subsektorPerusahaan = ss;
    }

    //Fungsi Setter dan Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getFaksimili() {
        return faksimili;
    }

    public void setFaksimili(String faksimili) {
        this.faksimili = faksimili;
    }

    public int getBadanHukum() {
        return badanHukum;
    }

    public void setBadanHukum(int badanHukum) {
        this.badanHukum = badanHukum;
    }

    public String getUsahaUtama() {
        return usahaUtama;
    }

    public void setUsahaUtama(String usahaUtama) {
        this.usahaUtama = usahaUtama;
    }

    public KIP getKip() {
        return kip;
    }

    public DPP getDppPerusahaan() {
        return dppPerusahaan;
    }


    public Subsektor getSubsektorPerusahaan() {
        return subsektorPerusahaan;
    }

    public String toString(){
        return String.format("Perusahaan [Nama : %s, "
                        + "Alamat : %s, "
                        + "Telpon : %s, "
                        + "Faksimili : %s, "
                        + "Usaha Utama : %s, "
                        + "Badan Hukum : %s]",getNama(),getAlamat(),getTelp(),
                getFaksimili(),getKetUsahaUtama(),getKetBadanHukum()) +
                kip.toString() + dppPerusahaan.toString() + subsektorPerusahaan.toString();
    }
}

