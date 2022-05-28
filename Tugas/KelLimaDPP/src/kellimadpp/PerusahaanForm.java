package kellimadpp;
/**
 * Anggota Kelompok 5 2KS3:
 * Pandya Almastiana Alifka 222011620
 * Moch. Daffa' AlFaris     222011622
 * Rahmad Setiya Budi       222011623
 * Amanda Christina Saragih 222011650
 * Nur Aini Adilah          222011676
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PerusahaanForm extends Form {
    private Perusahaan perusahaan;
    private String[] cekProvinsi = new String[] { "DKI Jakarta", "DKI jakarta", "DKI JAKARTA", "dki Jakarta", "dki jakarta" };
    private String[] cekKabupaten = new String[] { "Kepulauan Seribu", "Jakarta Selatan", "Jakarta Timur",  "Jakarta Pusat","Jakarta Barat", "Jakarta Utara" };
    private String[] cekKecamatanPulSer = new String[] { "Kepulauan Seribu Selatan", "Kepulauan Seribu Utara" };
    private String[] cekKecamatanJakSel = new String[] { "Jagakarsa", "Pasar Minggu", "Cilandak", "Pesanggrahan","Kebayoran Lama", "Kebayoran Baru", "Mampang Prapatan", "Pancoran", "Tebet", "Setia Budi" };
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

    private String[] cekJenisUsahaUtama = new String[] {"1","2","3a","3b","3c","3d","3e","3f","3g","3h","3i","3j","3k","4","5","6","7a",
            "7b", "7c", "7d", "7e", "7f", "8", "9", "10", "11" };
    private String[] cekKolom12 = new String[] {"0","1"};
    private String[] cekKolom13 = new String[] {"1","2","3","4","5","6","7","8","9"};
    private String[] cekSubsektor = new String[] {"0","1"};
    private String[] cekSubsektorPerkebunan = new String[] {"3a","3b","3c","3d","3e","3f","3g","3h","3i","3j","3k","0"};
    
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

    List<String> listCekJenisUsahaUtama = Arrays.asList(cekJenisUsahaUtama);

    List<String> listKolom12 = Arrays.asList(cekKolom12);
    List<String> listKolom13 = Arrays.asList(cekKolom13);
    List<String> listSubsektor = Arrays.asList(cekSubsektor);
    List<String> listSubsektorPerkebunan = Arrays.asList(cekSubsektorPerkebunan);
    

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
        // Kantor BPS
        if (perusahaan.kantorBPS.getNamaJelasProv().isEmpty()) {
            addErrorMessage("Nama Provinsi tidak boleh kosong!");
            
        }
        if (!listCekProvinsi.contains(perusahaan.kantorBPS.getNamaJelasProv())) {
            addErrorMessage("Provinsi pada Kantor BPS salah!");
            
        }
        if (perusahaan.kantorBPS.getNamaJelasKab() == null) {
            addErrorMessage("Kabupaten pada Kantor BPS tidak boleh kosong!");
            
        }
        if (!listCekKabupaten.contains(perusahaan.kantorBPS.getNamaJelasKab())) {
            addErrorMessage("Kabupaten pada Kantor BPS salah!");
            
        }
        if (perusahaan.kantorBPS.getNamaJelasPeriodeData() == null) {
            addErrorMessage("Nama Jelas Periode data tidak boleh kosong!");
            
        }
        if (perusahaan.kantorBPS.getNamaJelasPeriodeData().length() != 4) {
            addErrorMessage("Nama Jelas Periode data tidak valid!");
            
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
            addErrorMessage("Kode Periode data tidak valid!");
        }

        // Nama Perusahaan
        if (perusahaan.getNama() == null || perusahaan.getNama().isEmpty()) {
            addErrorMessage("Nama perusahaan tidak boleh kosong");
        }

        // Alamat Perusahaan
        if (perusahaan.alamat == null) {
            addErrorMessage("Alamat tidak valid!");
        }
        if (perusahaan.getAlamat().getProvinsi() == "") {
            addErrorMessage("Provinsi tidak boleh kosong!");
        }
        if (!listCekProvinsi.contains(perusahaan.getAlamat().getProvinsi())) {
            addErrorMessage("Provinsi pada Alamat Perusahaan salah!");
        }    
        if (perusahaan.getAlamat().getKabupatenKota() == "") {
            addErrorMessage("Kabupaten tidak boleh kosong!");
        }

        if (perusahaan.getAlamat().getKecamatan() == "") {
            addErrorMessage("Kecamatan tidak boleh kosong!");
        }
              
        if (perusahaan.getAlamat().getKelurahan() == "") {
            addErrorMessage("Kelurahan tidak boleh kosong!");
        }
        if (perusahaan.getAlamat().getKodePos() == "") {
            addErrorMessage("Kode Pos tidak boleh kosong!");
        }
        if (perusahaan.getAlamat().getNamaJalan() == "") {
            addErrorMessage("Nama Jalan tidak boleh kosong!");
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
        
        switch (perusahaan.getKip().getKodeKab()) {

            case "01":
                if (!listCekKodeKecamatanPulSer.contains(perusahaan.getKip().getKodeKec())) {
                    addErrorMessage("Kode Kecamatan KIP tidak valid!");
                }
                break;
            case "71":
                if (!listCekKodeKecamatanJakSel.contains(perusahaan.getKip().getKodeKec())) {
                    addErrorMessage("Kode Kecamatan KIP tidak valid!");
                }
                break;
            case "72":
                if (!listCekKodeKecamatanJakTim.contains(perusahaan.getKip().getKodeKec())) {
                    addErrorMessage("Kode Kecamatan KIP tidak valid!");
                }
                break;
            case "73":
                if (!listCekKodeKecamatanJakPus.contains(perusahaan.getKip().getKodeKec())) {
                    addErrorMessage("Kode Kecamatan KIP tidak valid!");
                }
                break;
            case "74":
                if (!listCekKodeKecamatanJakBar.contains(perusahaan.getKip().getKodeKec())) {
                    addErrorMessage("Kode Kecamatan KIP tidak valid!");
                }
                break;
            case "75":
                if (!listCekKodeKecamatanJakUt.contains(perusahaan.getKip().getKodeKec())) {
                    addErrorMessage("Kode Kecamatan KIP tidak valid!");
                }
                break;
            default:
                addErrorMessage("Kode Kecamatan KIP tidak valid!");
                break;
        }

        if (perusahaan.getKip().getKodeKJU() == "") {
            addErrorMessage("Kode KJU tidak boleh kosong!");
        }
        if (perusahaan.getKip().getNoUrut() == "") {
            addErrorMessage("Nomor Urut tidak boleh kosong!");
        }
        if (perusahaan.getKip().getKodeProv() == "") {
            addErrorMessage("Kode Provinsi tidak boleh kosong!");
        }
        if (perusahaan.getKip().getKodeKab() == "") {
            addErrorMessage("Kode Kabupaten tidak boleh kosong!");
        }
        if (perusahaan.getKip().getKodeKec() == "") {
            addErrorMessage("Kode Kecamatan tidak boleh kosong!");
        }

        // Telepon
        if (perusahaan.getTelepon() == null || perusahaan.getTelepon().isEmpty()) {
            addErrorMessage("Telepon perusahaan tidak boleh kosong");
        }
        if (!perusahaan.getTelepon().startsWith("0")) {
            addErrorMessage("Format telepon tidak valid!");
        }
        if (perusahaan.getTelepon().length() != 10) {
            addErrorMessage("Nomor telepon harus 10 digit!");
        }

        // Faksimile
        if (perusahaan.getFaksimil() == null || perusahaan.getFaksimil().isEmpty()) {
            addErrorMessage("Faksimil perusahaan tidak boleh kosong");
        }
        if (!perusahaan.getFaksimil().startsWith("0")) {
            addErrorMessage("Format faksimil tidak valid!");
        }
        if (perusahaan.getFaksimil().length() != 10) {
            addErrorMessage("Nomor faksimil harus 10 digit!");
        }

        // Bentuk Badan Hukum
        if (perusahaan.getBentukBadanHukum() == null) {
            addErrorMessage("Bentuk badan hukum perusahaan tidak boleh kosong");
        }
        if (perusahaan.bentukBadanHukum.getKodeBadanHukum() < 1 || perusahaan.bentukBadanHukum.getKodeBadanHukum() > 10) {
            addErrorMessage("Bentuk badan hukum tidak valid! input harus antara 1-10");
        }

        // DPP
        if (perusahaan.getDpp() == null) {
            addErrorMessage("DDP perusahaan tidak boleh kosong");
        }
        if (perusahaan.dpp.getKolom12() == "") {
            addErrorMessage("Kolom 12 tidak boleh kosong!");
        }
        if (perusahaan.dpp.getKolom13() == "") {
            addErrorMessage("Kolom 13 tidak boleh kosong!");
        }
        if (!listKolom12.contains(perusahaan.getDpp().getKolom12())) {
            addErrorMessage("Kolom 12 tidak valid! input harus 1 atau 0");
        }
        if (!listKolom13.contains(perusahaan.getDpp().getKolom13())) {
            addErrorMessage("Kolom 13 tidak valid! input harus antara 1-9");
        }

        // Subsektor
        if (perusahaan.getSubsektor() == null) {
            addErrorMessage("Subsektor perusahaan tidak boleh kosong");
        }
        if (perusahaan.getSubsektor().getTanamanPangan() == ""){
            addErrorMessage("Subsektor Tanaman Pangan tidak boleh kosong!");
        }
        if (perusahaan.getSubsektor().getHoltikultura() == "") {
            addErrorMessage("Subsektor Tanaman Pangan tidak boleh kosong!");
        }
        if (perusahaan.getSubsektor().getKehutanan() == ""){
            addErrorMessage("Subsektor Kehutanan tidak boleh kosong!");
        }
        if (perusahaan.getSubsektor().getPeternakan() == ""){
            addErrorMessage("Subsektor Peternakan tidak boleh kosong!");
        }
        if (perusahaan.getSubsektor().getPerikanan() == ""){
            addErrorMessage("Subsektor Perikanan tidak boleh kosong!");
        }
        if (perusahaan.getSubsektor().getPerkebunan() == ""){
            addErrorMessage("Subsektor Perkebunan tidak boleh kosong!");
        }

        if (!listSubsektor.contains(perusahaan.getSubsektor().getTanamanPangan())) {
            addErrorMessage("Subsektor Tanaman Pangan tidak valid! input harus 1 atau 0");
        } 
        if (!listSubsektor.contains(perusahaan.getSubsektor().getHoltikultura())) {
            addErrorMessage("Subsektor Holtikultura tidak valid! input harus 1 atau 0");
        }
        if (!listSubsektor.contains(perusahaan.getSubsektor().getKehutanan())) {
            addErrorMessage("Subsektor Kehutanan tidak valid! input harus 1 atau 0");
        }
        if (!listSubsektor.contains(perusahaan.getSubsektor().getPeternakan())) {
            addErrorMessage("Subsektor Peternakan tidak valid! input harus 1 atau 0");
        }
        if (!listSubsektor.contains(perusahaan.getSubsektor().getPerikanan())) {
            addErrorMessage("Subsektor Perikanan tidak valid! input harus 1 atau 0");
        }
        if (!listSubsektorPerkebunan.contains(perusahaan.getSubsektor().getPerkebunan())) {
            addErrorMessage("Subsektor Perkebunan tidak valid! 0 atau 3a sampai 3k");
        }

        // Jenis Usaha Utama
        if (perusahaan.getJenisUsahaUtama() == null) {
            addErrorMessage("Jenis usaha utama perusahaan tidak boleh kosong");
        }
        if (!listCekJenisUsahaUtama.contains(perusahaan.getJenisUsahaUtama().getJenisUsahaUtama())) {
            addErrorMessage("Jenis Usaha Utama tidak valid!"); 
        }

        return errorMessage.isEmpty();
    }

    public void addErrorMessage(String message) {
        super.addErrorMessage(message);
    }

    public ArrayList<String> getErrorMessage() {
        return super.getErrorMessage();
    }

    @Override
    public void reset() {
        super.reset();
    }
}