package modul2;

public class Mahasiswa4 {
    int nim;

    String nama;

    Mahasiswa4(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
    }
}
