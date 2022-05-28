package kellimadpp;
/**
 * Anggota Kelompok 5 2KS3:
 * Pandya Almastiana Alifka 222011620
 * Moch. Daffa' AlFaris     222011622
 * Rahmad Setiya Budi       222011623
 * Amanda Christina Saragih 222011650
 * Nur Aini Adilah          222011676
 */

public class Subsektor {
    private String tanamanPangan;
    private String holtikultura;
    private String perkebunan;
    private String peternakan;
    private String kehutanan;
    private String perikanan;

    Subsektor() {

    }

    Subsektor(String tanamanPangan, String holtikultura, String perkebunan, String peternakan, String kehutanan, String perikanan) {
        this.tanamanPangan = tanamanPangan;
        this.holtikultura = holtikultura;
        this.perkebunan = perkebunan;
        this.peternakan = peternakan;
        this.kehutanan = kehutanan;
        this.perikanan = perikanan;
    }

    public String getTanamanPangan() {
        return tanamanPangan;
    }

    public void setTanamanPangan(String tanamanPangan) {
        this.tanamanPangan = tanamanPangan;
    }

    public String getHoltikultura() {
        return holtikultura;
    }

    public void setHoltikultura(String holtikultura) {
        this.holtikultura = holtikultura;
    }

    public String getPerkebunan() {
        return perkebunan;
    }

    public void setPerkebunan(String perkebunan) {
        this.perkebunan = perkebunan;
    }

    public String getPeternakan() {
        return peternakan;
    }

    public void setPeternakan(String peternakan) {
        this.peternakan = peternakan;
    }

    public String getKehutanan() {
        return kehutanan;
    }

    public void setKehutanan(String kehutanan) {
        this.kehutanan = kehutanan;
    }

    public String getPerikanan() {
        return perikanan;
    }

    public void setPerikanan(String perikanan) {
        this.perikanan = perikanan;
    }
}
