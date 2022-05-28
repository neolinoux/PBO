import java.sql.Date;

public abstract class Orang {
    private String nama;
    private Date tanggalLahir;

    Orang(String nama, Date tanggalLahir) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNamaPanggilan() {
        return nama.substring(0, 3);
    }
}
