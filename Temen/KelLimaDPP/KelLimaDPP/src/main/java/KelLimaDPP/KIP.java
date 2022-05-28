/*
Kelompok 05
1. Akhir Mubarok	            222011698
2. Avelia Deavy Putri Primadani	222011655
3. I Made Satria Ambara Putra	222011635
4. Mohammad Fikri Syams	        222011546
5. Randi Qodri .P	            222011549
*/
package KelLimaDPP;
public class KIP {
    private int kodKab,kodProv,kodKec,kodKJU,noUrut;

    public void setKodKab(int kodKab) {
            this.kodKab = kodKab;
    }
    
    public void setKodProv(int kodProv) {
            this.kodProv = kodProv;
    }

    public void setKodKec(int kodKec) {
            this.kodKec = kodKec;
    }

    public void setKodKJU(int kodKJU) {
        this.kodKJU = kodKJU;
    }

    public void setNoUrut(int noUrut) {
        this.noUrut = noUrut;
    }

    public int getKodKab() {
        return kodKab;
    }

    public int getKodProv() {
        return kodProv;
    }

    public int getKodKec() {
        return kodKec;
    }

    public int getKodKJU() {
        return kodKJU;
    }

    public int getNoUrut() {
        return noUrut;
    }
    
    public String toString(){
        return String.format("\nKIP [Kode Provinsi : %d, "
                + "Kode Kabupaten : %d, "
                + "Kode Kecamatan : %d, "
                + "Kode KJU : %d, "
                + "No urut : %d]", this.kodProv,this.kodKab,this.kodKec,this.kodKJU,this.noUrut);
    }
}