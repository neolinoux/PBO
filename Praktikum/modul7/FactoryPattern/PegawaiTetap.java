package FactoryPattern;

public class PegawaiTetap extends Pegawai {
    public PegawaiTetap(String nama) {
        setNama(nama);
        setTipe("Permanen");
        setPembayaranGaji("Bulanan");
    }
}
