import java.util.ArrayList;
import java.util.List;

public class Gedung {
    private List<Ruang> daftarRuang = new ArrayList<Ruang>();

    public Gedung(List<Ruang> daftarRuang) {
        Ruang ruang = new Ruang("Utama");
        daftarRuang.add(ruang);
    }

    public Gedung() {
        
    }

    public void addRuang(String namaRuang){
        Ruang ruang = new Ruang(namaRuang);
        daftarRuang.add(ruang);
    }

    public List<Ruang> getDaftarRuang() {
        return daftarRuang;
    }
}
