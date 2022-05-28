package kellimadpp;
/**
 * Anggota Kelompok 5 2KS3:
 * Pandya Almastiana Alifka 222011620
 * Moch. Daffa' AlFaris     222011622
 * Rahmad Setiya Budi       222011623
 * Amanda Christina Saragih 222011650
 * Nur Aini Adilah          222011676
 */

public class JenisUsahaUtama {
    private String jenisUsahaUtama;

    public JenisUsahaUtama(String jenisUsahaUtama) {
        this.jenisUsahaUtama = jenisUsahaUtama;
    }

    public JenisUsahaUtama() {
    }

    public String getJenisUsahaUtama() {
        return jenisUsahaUtama;
    }

    public void setJenisUsahaUtama(String jenisUsahaUtama) {
        this.jenisUsahaUtama = jenisUsahaUtama;
    }

    @Override
    public String toString() {
        return jenisUsahaUtama;
    }
}
