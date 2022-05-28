public class Orang {
    private String name;
    private Rute rute;
    private String asal;
    private String tujuan;

    Orang(String name) {
        this.name = name;
    }

    public Orang(String name, Rute rute) {
        this.name = name;
        this.rute = rute;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public void setRute(Rute rute) {
        this.rute = rute;
    }

    public void berangkat() {
        rute.jalan(name, asal, tujuan);
    }
}
