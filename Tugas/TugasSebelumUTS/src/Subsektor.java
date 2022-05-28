public class Subsektor {
    private int tanamanPangan;
    private int holtikultura;
    private int perkebunan;
    private int peternakan;
    private int kehutanan;
    private int perikanan;

    Subsektor() {

    }

    Subsektor(int tanamanPangan, int holtikultura, int perkebunan, int peternakan, int kehutanan, int perikanan) {
        this.tanamanPangan = tanamanPangan;
        this.holtikultura = holtikultura;
        this.perkebunan = perkebunan;
        this.peternakan = peternakan;
        this.kehutanan = kehutanan;
        this.perikanan = perikanan;
    }

    public int getTanamanPangan() {
        return tanamanPangan;
    }

    public void setTanamanPangan(int tanamanPangan) {
        this.tanamanPangan = tanamanPangan;
    }

    public int getHoltikultura() {
        return holtikultura;
    }

    public void setHoltikultura(int holtikultura) {
        this.holtikultura = holtikultura;
    }

    public int getPerkebunan() {
        return perkebunan;
    }

    public void setPerkebunan(int perkebunan) {
        this.perkebunan = perkebunan;
    }

    public int getPeternakan() {
        return peternakan;
    }

    public void setPeternakan(int peternakan) {
        this.peternakan = peternakan;
    }

    public int getKehutanan() {
        return kehutanan;
    }

    public void setKehutanan(int kehutanan) {
        this.kehutanan = kehutanan;
    }

    public int getPerikanan() {
        return perikanan;
    }

    public void setPerikanan(int perikanan) {
        this.perikanan = perikanan;
    }
}
