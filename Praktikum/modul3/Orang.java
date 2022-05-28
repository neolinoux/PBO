import java.time.LocalDate;
import java.util.Date;

public class Orang {
    private String nama;
    private Date tanggalLahir;

    public Orang(){

    }

    public Orang(String nama){
        this.nama = nama;
    }

    public Orang(String nama, Date tanggalLahir){
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void getGaji(){
        System.out.println("Gaji kosong");
    }
}
