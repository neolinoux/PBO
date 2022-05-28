package modul2;

public class MahasiswaMain4 {
    public static void main(String[] args) {
        Mahasiswa3 s1 = new Mahasiswa3();
        Mahasiswa3 s2 = new Mahasiswa3();

        s1.tambahData(123, "Budi");
        s2.tambahData(456, "Utomo");

        s1.tampilkanInfo();
        s2.tampilkanInfo();
    }
}
