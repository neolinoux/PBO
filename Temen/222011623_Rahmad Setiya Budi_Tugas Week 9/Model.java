import java.util.ArrayList;
import java.util.List;

public class Model {
    // private nim,nama,umur, asal
    private String nim;
    private String nama;
    private int umur;
    private String asal;
    private List errorMessages = new ArrayList();
    private List daftarMahasiswa = new ArrayList();

    public Model() {
    }

    public Model(String nim, String nama, int umur, String asal) {
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
        this.asal = asal;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return this.umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAsal() {
        return this.asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public Model nim(String nim) {
        setNim(nim);
        return this;
    }

    public Model nama(String nama) {
        setNama(nama);
        return this;
    }

    public Model umur(int umur) {
        setUmur(umur);
        return this;
    }

    public Model asal(String asal) {
        setAsal(asal);
        return this;
    }

    // add eror message
    public void addErrorMessage(String errorMessage) {
        errorMessages.add(errorMessage);
    }

    public List getErrorMessages() {
        return errorMessages;
    }

    public void clearErrorMessages() {
        errorMessages.clear();
    }

    public void addMahasiswa(String mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public List getDaftarMahasiswa() {
        return daftarMahasiswa;
    }

    @Override
    public String toString() {
        return "{" +
                " nim='" + getNim() + "'" +
                ", nama='" + getNama() + "'" +
                ", umur='" + getUmur() + "'" +
                ", asal='" + getAsal() + "'" +
                "}";
    }

}
