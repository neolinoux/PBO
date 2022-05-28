import java.util.Date;

public abstract class Orang2 {
    private String nama;
    private Date tanggalLahir;

    public Orang2(){

    }

    public Orang2(String nama){
        this.nama = nama;
    }

    public Orang2(String nama, Date tanggalLahir){
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

    public void getGaji() {
        System.out.println("Gaji kosong");
    }
    
    public abstract String getAlamat();

    public abstract void setAlamat(String alamat);
}
