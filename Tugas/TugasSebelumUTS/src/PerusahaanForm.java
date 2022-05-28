import java.util.Arrays;
import java.util.List;

public class PerusahaanForm extends Form {
    private Perusahaan perusahaan;
    private String[] cekProvinsi = new String[] { "DKI Jakarta", "DKI jakarta", "DKI JAKARTA", "dki Jakarta", "dki jakarta" };
    private String[] cekKabupaten = new String[] { "Kepulauan Seribu", "Jakarta Selatan", "Jakarta Timur",  "Jakarta Pusat","Jakarta Barat", "Jakarta Utara" };
    private String[] cekKecamatanPulSer = new String[] { "Kepulauan Seribu Selatan", "Kepulauan Seribu Utara" };
    private String[] cekKecamatanJakSel = new String[] { "Jagaskara", "Pasar Minggu", "Cilandak", "Pesanggrahan","Kebayoran Lama", "Kebayoran Baru", "Mampang Prapatan", "Pancoran", "Tebet", "Setia Budi" };
    private String[] cekKecamatanJakTim = new String[] { "Pasar Rebo", "Ciracas", "Cipayung", "Makassar", "Kramat Jati", "Jatinegara", "Duren Sawit", "Cakung", "Pulo Gadung", "Matraman" };
    private String[] cekKecamatanJakPus = new String[] { "Tanah Abang", "Menteng", "Senen", "Johar Baru", "Cempaka Putih", "Kemayoran", "Saswah Besar", "Gambir"};
    private String[] cekKecamatanJakBar = new String[] { "Kembangan", "Kebon Jeruk", "Palmerah", "Grogol Petamburan", "Tambora", "Taman Sari", "Cengkareng", "Kali Deres" };
    private String[] cekKecamatanJakUt = new String[] { "Penjaringan", "Pademangan", "Tanjung Priok", "Koja", "Kelapa Gading", "Cilincing" };

    private String[] cekKodeProvinsi = new String[] { "31" };
    private String[] cekKodeKabupaten = new String[] { "01", "71", "72", "73", "74", "75" };
    private String[] cekKodeKecamatanPulSer = new String[] { "010", "020" };
    private String[] cekKodeKecamatanJakSel = new String[] { "010", "020", "030", "040", "050", "060", "070", "080", "090", "100" };
    private String[] cekKodeKecamatanJakTim = new String[] { "010", "020", "030", "040", "050", "060", "070", "080", "090", "100" };
    private String[] cekKodeKecamatanJakPus = new String[] { "010", "020", "030", "040", "050", "060", "070", "080" };
    private String[] cekKodeKecamatanJakBar = new String[] { "010", "020", "030", "040", "050", "060", "070", "080" };
    private String[] cekKodeKecamatanJakUt = new String[] { "010", "020", "030", "040", "050", "060" };

    List<String> listCekProvinsi = Arrays.asList(cekProvinsi);
    List<String> listCekKabupaten = Arrays.asList(cekKabupaten);
    List<String> listCekKecamatanJakPus = Arrays.asList(cekKecamatanJakPus);
    List<String> listCekKecamatanJakSel = Arrays.asList(cekKecamatanJakSel);
    List<String> listCekKecamatanJakTim = Arrays.asList(cekKecamatanJakTim);
    List<String> listCekKecamatanJakBar = Arrays.asList(cekKecamatanJakBar);
    List<String> listCekKecamatanPulSer = Arrays.asList(cekKecamatanPulSer);
    List<String> listCekKecamatanJakUt = Arrays.asList(cekKecamatanJakUt);
    List<String> listCekKodeProvinsi = Arrays.asList(cekKodeProvinsi);
    List<String> listCekKodeKabupaten = Arrays.asList(cekKodeKabupaten);
    List<String> listCekKodeKecamatanPulSer = Arrays.asList(cekKodeKecamatanPulSer);
    List<String> listCekKodeKecamatanJakPus = Arrays.asList(cekKodeKecamatanJakPus);
    List<String> listCekKodeKecamatanJakSel = Arrays.asList(cekKodeKecamatanJakSel);
    List<String> listCekKodeKecamatanJakTim = Arrays.asList(cekKodeKecamatanJakTim);
    List<String> listCekKodeKecamatanJakBar = Arrays.asList(cekKodeKecamatanJakBar);
    List<String> listCekKodeKecamatanJakUt = Arrays.asList(cekKodeKecamatanJakUt);

    PerusahaanForm() {

    }

    PerusahaanForm(Perusahaan perusahaan) {
        this.perusahaan = perusahaan;
    }

    public Perusahaan getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(Perusahaan perusahaan) {
        this.perusahaan = perusahaan;
    }

    @Override
    public Boolean validate() {
        // Index Formulir
        if (perusahaan.kantorBPS.getNamaJelasProv().isEmpty()) {
            addErrorMessage("Nama Provinsi tidak boleh kosong!");
        }
        if(!listCekProvinsi.contains(perusahaan.kantorBPS.getNamaJelasProv())) {
            addErrorMessage("Provinsi pada index formulir salah!");
        }
        if (perusahaan.kantorBPS.getNamaJelasKab() == null) {
            addErrorMessage("Kabupaten pada index formulir tidak boleh kosong!");
        }
        if (!listCekKabupaten.contains(perusahaan.kantorBPS.getNamaJelasKab())) {
            addErrorMessage("Kabupaten pada index formulir salah!");
        }
        if (perusahaan.kantorBPS.getNamaJelasPeriodeData() == null) {
            addErrorMessage("Periode data tidak boleh kosong!");
        }
        if (perusahaan.kantorBPS.getNamaJelasPeriodeData().length() != 4) {
            addErrorMessage("Periode data tidak valid!");
        }
        if (perusahaan.kantorBPS.getKodeProv() == null) {
            addErrorMessage("Kode Provinsi tidak boleh kosong!");
        } 
        if (!listCekKodeProvinsi.contains(perusahaan.kantorBPS.getKodeProv())) {
            addErrorMessage("Kode Provinsi tidak valid!");
        }
        if (perusahaan.kantorBPS.getKodeKab() == null) {
            addErrorMessage("Kode Kabupaten tidak boleh kosong!");
        }
        if (!listCekKodeKabupaten.contains(perusahaan.kantorBPS.getKodeKab())) {
            addErrorMessage("Kode Kabupaten tidak valid!");
        }
        if (perusahaan.kantorBPS.getKodePeriodeData() == null) {
            addErrorMessage("Kode Periode Data tidak boleh kosong!");
        }
        if (perusahaan.kantorBPS.getKodePeriodeData().length() != 4) {
            addErrorMessage("Periode data tidak valid!");
        }
        
        // Nama Perusahaan
        if (perusahaan.getNama() == null || perusahaan.getNama().isEmpty()) {
            addErrorMessage("Nama perusahaan tidak boleh kosong");
        }

        // Alamat Perusahaan
        if (perusahaan.alamat == null) {
            addErrorMessage("Alamat tidak valid!");
        }
        
        // KIP
        if (perusahaan.getKip() == null) {
            addErrorMessage("KIP perusahaan tidak boleh kosong");
        }
        if (!listCekKodeProvinsi.contains(perusahaan.getKip().getKodeProv())) {
            addErrorMessage("Kode Provinsi KIP tidak valid!");
        }
        if (!listCekKodeKabupaten.contains(perusahaan.getKip().getKodeKab())) {
            addErrorMessage("Kode Kabupaten KIP tidak valid!");
        }
        if (!listCekKodeKecamatanPulSer.contains(perusahaan.getKip().getKodeKec())) {
            addErrorMessage("Kode Kecamatan KIP tidak valid!");
        }
        if (!listCekKodeKecamatanJakPus.contains(perusahaan.getKip().getKodeKec())) {
            addErrorMessage("Kode Kecamatan KIP tidak valid!");
        }
        if (!listCekKodeKecamatanJakSel.contains(perusahaan.getKip().getKodeKec())) {
            addErrorMessage("Kode Kecamatan KIP tidak valid!");
        }
        if (!listCekKodeKecamatanJakTim.contains(perusahaan.getKip().getKodeKec())) {
            addErrorMessage("Kode Kecamatan KIP tidak valid!");
        }
        if (!listCekKodeKecamatanJakBar.contains(perusahaan.getKip().getKodeKec())) {
            addErrorMessage("Kode Kecamatan KIP tidak valid!");
        }
        if (!listCekKodeKecamatanJakUt.contains(perusahaan.getKip().getKodeKec())) {
            addErrorMessage("Kode Kecamatan KIP tidak valid!");
        }
        if (perusahaan.getKip().getKodeKJU() == null) {
            addErrorMessage("Kode KJU tidak boleh kosong!");
        }
        if (perusahaan.getKip().getNoUrut() == null) {
            addErrorMessage("Nomor Urut tidak boleh kosong!");
        }

        // Telepon
        if (perusahaan.getTelepon() == null || perusahaan.getTelepon().isEmpty()) {
            addErrorMessage("Telepon perusahaan tidak boleh kosong");
        }

        // Faksimile
        if (perusahaan.getFaksimil() == null || perusahaan.getFaksimil().isEmpty()) {
            addErrorMessage("Faksimil perusahaan tidak boleh kosong");
        }

        // Bentuk Badan Hukum
        if (perusahaan.getBentukBadanHukum() == null) {
            addErrorMessage("Bentuk badan hukum perusahaan tidak boleh kosong");
        }
        
        // DDP
        if (perusahaan.getDdp() == null) {
            addErrorMessage("DDP perusahaan tidak boleh kosong");
        }

        // Subsektor
        if (perusahaan.getSubsektor() == null) {
            addErrorMessage("Subsektor perusahaan tidak boleh kosong");
        }
        
        // Jenis Usaha Utama
        if (perusahaan.getJenisUsahaUtama() == null) {
            addErrorMessage("Jenis usaha utama perusahaan tidak boleh kosong");
        }

        return true;
    }
}
