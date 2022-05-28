package modul2;
public class MahasiswaMain3 {
    public static void main(String[] args) {
        Mahasiswa2 s1 = new Mahasiswa2();
        Mahasiswa2 s2 = new Mahasiswa2();

        s1.nim = 123;
        s1.nama = "Budi";
        s2.nim = 456;
        s2.nama = "Utomo";
        System.out.println(s1.nim+" "+s1.nama);
        System.out.println(s2.nim+" "+s2.nama);
    }
}
