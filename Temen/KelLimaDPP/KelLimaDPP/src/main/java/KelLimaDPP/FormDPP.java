/*
Kelompok 05
1. Akhir Mubarok	            222011698
2. Avelia Deavy Putri Primadani	222011655
3. I Made Satria Ambara Putra	222011635
4. Mohammad Fikri Syams	        222011546
5. Randi Qodri .P	            222011549
*/
package KelLimaDPP;
public class FormDPP extends Form {
    DPP dpp;

    public DPP getDpp() {
        return dpp;
    }

    public void setDpp(DPP dpp) {
        this.dpp = dpp;
    }

    @Override
    public void reset() {
        dpp = null;
    }

    @Override
    public boolean validate() {
        if(getDpp().getStatus()<1||getDpp().getStatus()>9){
            String msg = "Invalid DPP Perusahaan dengan status " + getDpp().getStatus()+ " : Status perusahaan yang diinputkan harus diantara 1-9";
            super.addErrorMessage(msg);
        }
        //jika status dpp bernilai kurang dari 1 atau lebih dari 9 maka akan keluar pesan eror seperti pada variabel msg. pada pesan error akan ditunjukkan kesalahannya dan memberitahu isiannya yang benar
        if(getDpp().getKonfirmasiKeberadaan()!=1 && getDpp().getKonfirmasiKeberadaan()!=0){
            String msg = "Invalid DPP Perusahaan dengan konfirmasi keberadaan" + getDpp().getKeteranganStatus() + " : Konfirmasi perusahaan yang diinputkan harus diantara 0-1";
            super.addErrorMessage(msg);
        }
        //jika konfirmasi dpp bernilai tidak sama dengan 1 dan tidak sama dengan 0, maka akan keluar pesan eror seperti pada variabel msg. pada pesan error akan ditunjukkan kesalahannya dan memberitahu isiannya yang benar
        return super.getErrorMessage().isEmpty();
    }
    
    @Override
    public void save(){
    }
}
