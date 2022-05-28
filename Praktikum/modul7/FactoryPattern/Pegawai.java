package FactoryPattern;

public class Pegawai {
    private String nama;
    private String tipe;
    private String pembayaranGaji;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getTipe() {
        return tipe;
    }

    public void setPembayaranGaji(String pembayaranGaji) {
        this.pembayaranGaji = pembayaranGaji;
    }

    public String getPembayaranGaji() {
        return pembayaranGaji;
    }

    @Override
    public String toString() {
        return "Nama = " + nama + ", \nTipe = " + tipe + ", \nPembayaran Gaji = " + pembayaranGaji;
    }
}
