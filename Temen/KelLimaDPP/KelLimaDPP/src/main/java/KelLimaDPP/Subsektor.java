/*
Kelompok 05
1. Akhir Mubarok	            222011698
2. Avelia Deavy Putri Primadani	222011655
3. I Made Satria Ambara Putra	222011635
4. Mohammad Fikri Syams	        222011546
5. Randi Qodri .P	            222011549
*/
package KelLimaDPP;

public class Subsektor {
    private int tanamanPangan, hortikultura, peternakan, kehutanan, perikanan;
    private String perkebunan;
    private static String arrPerkebunan[] ={"3a", "3b","3c","3d","3e","3f","3g","3h","3i","3j","3k","0"};
    //variabel private karena hanya digunakan di class Subsektor

    public static String[] getArrPerkebunan(){
        return Subsektor.arrPerkebunan;
    }

    public int getTanamanPangan() {
        return tanamanPangan;
    }

    public void setTanamanPangan(int tanamanPangan) {
        this.tanamanPangan = tanamanPangan;
    }

    public int getHortikultura() {
        return hortikultura;
    }

    public void setHortikultura(int hortikultura) {
        this.hortikultura = hortikultura;
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

    public String getPerkebunan() {
        return perkebunan;
    }

    public void setPerkebunan(String perkebunan) {
        this.perkebunan = perkebunan;
    }
    
    public String getKetTanamanPangan(){
        String str = "";
        switch (this.tanamanPangan) {
        case 0:
            str="Tidak Ada Tanaman Pangan";
            break; //untuk memerintahkan komputer untuk berhenti mengecek case yang lainnya.
        case 1:
            str="Ada Tanaman Pangan";
            break;
        default: //jika nilai variabel tidak ada yang sama dengan pilihan case di atas, maka kerjakan kode yang ada di dalam default.
            str="Tidak Valid";
            break;
        }
        return str;
    }
    public String getKetHortikultura(){
        String str = "";
        switch (this.hortikultura) {
        case 0:
            str="Tidak Ada Hortikultura";
            break;
        case 1:
            str="Ada Hortikultura";
            break;
        default:
            str="Tidak Valid";
            break;
        }
        return str;
    }
    
    public String getKetPeternakan(){
        String str = "";
        switch (this.peternakan) {
        case 0:
            str="Tidak Ada Peternakan";
            break;
        case 1:
            str="Ada Peternakan";
            break;
        default:
            str="Tidak Valid";
            break;
        }
        return str;
    }
    public String getKetKehutanan(){
        String str = "";
        switch (this.kehutanan) {
        case 0:
            str="Tidak Ada Kehutanan";
            break;
        case 1:
            str="Ada Kehutanan";
            break;
        default:
            str="Tidak Valid";
            break;
        }
        return str;
    }
    
    public String getKetPerikanan(){
        String str = "";
        switch (this.perikanan) {
        case 0:
            str="Tidak Ada Perikanan";
            break;
        case 1:
            str="Ada Perikanan";
            break;
        default:
            str="Tidak Valid";
            break;
        }
        return str;
    }
    
    
    public String getKetPerkebunan(){
        String str = "";
        switch(this.perkebunan){
            case "3a" : 
                str = "Kakao/Cokelat";
                break;
            case "3b" :
                str = "Karet";
                break;
            case "3c" :
                str = "Kelapa Sawit";
                break;
            case "3d" :
                str = "Kopi";
                break;
            case "3e" :
                str = "Teh";
                break;
            case "3f" :
                str = "Tebu";
                break;
            case "3g" :
                str = "Tembakau";
                break;
            case "3h" :
                str = "Cengkeh";
                break;
            case "3i" :
                str = "Kelapa";
                break;
            case "3j" :
                str = "Lada";
                break;
            case "3k" :
                str = "Tanaman lainnya";
                break;
            case "0" :
                str = "Tidak Ada";
                break;
            default :
                str = "Tidak terdaftar";
                break;
        }
        return str;
    }
    
    public String toString(){
        return String.format("\nSubsektor[Tanaman Pangan : %s, "
                + "Hortikultura : %s, "
                + "Peternakan : %s, "
                + "Kehutanan : %s, "
                + "Perikanan : %s, "
                + "Perkebunan : %s]",getKetTanamanPangan(),getKetHortikultura(),
                getKetPeternakan(),getKetKehutanan(),getKetPerikanan(),
                getKetPerkebunan());
    }   
}
