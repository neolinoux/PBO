package FactoryPattern;

public class PegawaiKontrak extends Pegawai {
    public PegawaiKontrak(String nama) {
        setNama(nama);
        setTipe("Kontrak");
        setPembayaranGaji("Perjam");
    }
}
