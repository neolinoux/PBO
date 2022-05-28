import java.sql.Date;

public class Pegawai extends Orang implements Dosen {
    private String NIP;
    private String kantor;
    private String unitKerja;
    
    Pegawai(String nama, Date tanggalLahir) {
        super(nama, tanggalLahir);
    }
    
    public String getNIP() {
        return NIP;
    }

    public String getKantor() {
        return kantor;
    }

    public void setNIP(String nIP) {
        NIP = nIP;
    }

    public void setKantor(String kantor) {
        this.kantor = kantor;
    }

    @Override
    public String getNIDN() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setNIDN(String nIDN) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getKeahlian() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setKeahlian(String keahlian) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getPekerjaan() {
        // TODO Auto-generated method stub
        return null;
    }
}
