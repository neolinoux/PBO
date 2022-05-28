import java.util.List;

public class unitKerja2 {
    private String nama;
    private List<Pegawai> daftarPegawai;

    public unitKerja2(String nama, List<Pegawai> daftarPegawai) {
        this.nama = nama;
        this.daftarPegawai = daftarPegawai;
    }

    public String getNama() {
        return nama;
    }

    public List<Pegawai> getDaftarPegawai() {
        return daftarPegawai;
    }

    @Override
    public String toString() {
        return "unitKerja{" +
                "nama='" + nama + '\'' +
                ", daftarPegawai=" + daftarPegawai +
                '}';
    }
}
