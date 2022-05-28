package FactoryPattern;

public class FactoryPatternMain {
    public static void main(String[] args) {
        PegawaiFactory pegawai = new PegawaiFactory();
        System.out.println(pegawai.buatPegawai("Budi", "Kontrak").toString());
        System.out.println(pegawai.buatPegawai("Siti", "Permanen").toString());
    }
}
