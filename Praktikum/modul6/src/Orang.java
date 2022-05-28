package src;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Orang {
    private String nama;
    private Calendar tanggalLahir;

    Orang() {
        
    }

    Orang(String nama, Calendar tanggalLahir) {
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

    public void setTanggalLahir(Calendar tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getTanggalLahir() throws Exception {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
            validateTanggallahir();
            return sdf.format(tanggalLahir.getTime()).toString();
        } 
        catch (Exception e) {
            return "Belum Tersedia.";
        } 
        finally {
            System.out.println("error tertangani");
        }
    }
    
    public void validateTanggallahir() throws Exception {
        if (tanggalLahir.get(Calendar.YEAR) < 2000) {
            throw new Exception("Dibawah umur");
        }
        else {
            System.out.println("Cukup umur");
        }
    }
}
