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
