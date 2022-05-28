package modul2;

public class Mahasiswa3 {
    int nim;
    String nama;

    void tambahData(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
    }
}
