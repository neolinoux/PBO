public class Pegawai extends Orang{
    private String NIP;
    private String namaKantor;
    private String unitKerja;

    public Pegawai(){

    }

    public Pegawai(String NIP, String namaKantor, String unitKerja){
        this.NIP = NIP;
        this.namaKantor = namaKantor;
        this.unitKerja = unitKerja;
    }

    public Pegawai(String NIP, String namaKantor, String unitKerja, String nama){
        super(nama);
        this.NIP = NIP;
        this.namaKantor = namaKantor;
        this.unitKerja = unitKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNamaKantor() {
        return namaKantor;
    }

    public void setNamaKantor(String namaKantor) {
        this.namaKantor = namaKantor;
    }

    public String getUnitKerja() {
        return unitKerja;
    }

    public void setUnitKerja(String unitKerja) {
        this.unitKerja = unitKerja;
    }

    @Override
    public void getGaji(){
        System.out.println("Gaji 1 Miliar US Dollar ga kena pajak aamiinn");
    }
}
