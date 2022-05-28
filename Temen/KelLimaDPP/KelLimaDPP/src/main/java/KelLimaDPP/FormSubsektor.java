/*
Kelompok 05
1. Akhir Mubarok	        222011698
2. Avelia Deavy Putri Primadani	222011655
3. I Made Satria Ambara Putra	222011635
4. Mohammad Fikri Syams	        222011546
5. Randi Qodri .P	        222011549
*/
package KelLimaDPP;
public class FormSubsektor extends Form{
    Subsektor subsektor;

    public Subsektor getSubsektor() {
        return subsektor;
    }

    public void setSubsektor(Subsektor subsektor) {
        this.subsektor = subsektor;
    }

    @Override
    public void reset() {
        subsektor = null;
    }

    @Override
    public boolean validate() {
        if(getSubsektor().getTanamanPangan()!=0&&getSubsektor().getTanamanPangan()!=1){
            String msg = "Invalid Tanaman Pangan " +getSubsektor()+ " : Kode Tanaman Pangan  yang diinputkan tidak boleh selain 0 dan 1";
            super.addErrorMessage(msg);
        }

        if(getSubsektor().getHortikultura()!=0&&getSubsektor().getHortikultura()!=1){
            String msg = "Invalid Hortikultural " +getSubsektor()+ " : Kode Hortikulural  yang diinputkan tidak boleh selain 0 dan 1";
            super.addErrorMessage(msg);
        }
        
        if(getSubsektor().getPeternakan()!=0&&getSubsektor().getPeternakan()!=1){
            String msg = "Invalid Peternakan " +getSubsektor()+ " : Kode Peternakan  yang diinputkan tidak boleh selain 0 dan 1";
            super.addErrorMessage(msg);
        }

        if(getSubsektor().getKehutanan()!=0&&getSubsektor().getKehutanan()!=1){
            String msg = "Invalid Kehutanan " +getSubsektor()+ " : Kode Kehutanan  yang diinputkan tidak boleh selain 0 dan 1";
            super.addErrorMessage(msg);
        }

        if(getSubsektor().getPerikanan()!=0&&getSubsektor().getPerikanan()!=1){
            String msg = "Invalid Perikanan " +getSubsektor()+ " : Kode Perikanan  yang diinputkan tidak boleh selain 0 dan 1";
            super.addErrorMessage(msg);
        }
        
        if(subsektor.getPerkebunan() == null||subsektor.getPerkebunan().equals("")){
            String msg = "Invalid Perkebunan : Perkebunan tidak boleh kosong";
            super.addErrorMessage(msg);
        }

        if(!(subsektor.getPerkebunan()== null||subsektor.getPerkebunan().equals(""))){
            boolean cekPerkebunan = false;
            for(int i=0;i<Subsektor.getArrPerkebunan().length;i++){
                if(subsektor.getPerkebunan().equals(Subsektor.getArrPerkebunan()[i])){
                    cekPerkebunan = true;
                    break;
                }
            }
            if(cekPerkebunan==false){
                String msg = "Invalid Perkebunan : Perkebunan tidak valid";
                super.addErrorMessage(msg);
            }
        }
        return super.getErrorMessage().isEmpty();
    }
    
    @Override
    public void save(){
    }            
}

