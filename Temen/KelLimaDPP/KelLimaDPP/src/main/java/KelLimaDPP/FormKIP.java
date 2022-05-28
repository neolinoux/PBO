/*
Kelompok 05
1. Akhir Mubarok	            222011698
2. Avelia Deavy Putri Primadani	222011655
3. I Made Satria Ambara Putra	222011635
4. Mohammad Fikri Syams	        222011546
5. Randi Qodri .P	            222011549
*/
package KelLimaDPP;
// mengextend class form yang merupakan abstract, karena ingin memakai fungsi validate, reset, dan save yang ada di class form
public class FormKIP extends Form{
    KIP kip;

    public KIP getKip() {
        return kip;
    }

    public void setKip(KIP kip) {
        this.kip = kip;
    }

    // karena mengakses fungsi di class yang lain maka perlu @Override
    // || (OR OR) merupakan operator untuk melakukan operasi logika OR
    @Override
    public boolean validate() {
        // Kode Provinsi terdiri dari paling banyak 2 digit
        if(getKip().getKodProv()<1||getKip().getKodProv()>99){
            String msg = "Invalid KIP Perusahaan dengan KIP " +getKip()+ " : Kode Provinsi perusahaan yang diinputkan tidak boleh kosong dan merupakan bilangan dua digit";
            super.addErrorMessage(msg);
        }
        // Kode Kabupaten terdiri dari paling banyak 2 digit
        if(getKip().getKodKab()<1||getKip().getKodKab()>99){
            String msg = "Invalid KIP Perusahaan dengan KIP " +getKip()+ " : Kode Kabupaten perusahaan yang diinputkan tidak boleh kosong dan merupakan bilangan dua digit";
            super.addErrorMessage(msg);
        }
        // Kode Kecamatan terdiri dari paling banyak 3 digit
        if(getKip().getKodKec()<1||getKip().getKodKec()>999){
            String msg = "Invalid KIP Perusahaan dengan KIP " +getKip()+ " : Kode Kecamatan perusahaan yang diinputkan tidak boleh kosong dan merupakan bilangan dua digit";
            super.addErrorMessage(msg);
        }

        // Kode Kecamatan terdiri dari paling banyak 2 digit
        if(getKip().getKodKJU()<1||getKip().getKodKJU()>99){
            String msg = "Invalid KIP Perusahaan dengan KIP " +getKip()+ " : Kode KJU perusahaan yang diinputkan tidak boleh kosong dan merupakan bilangan dua digit";
            super.addErrorMessage(msg);
        }
        if(getKip().getNoUrut()<0){
            String msg = "Invalid KIP Perusahaan dengan KIP " +getKip()+ " : No Urut perusahaan yang diinputkan harus bilangan positif";
            super.addErrorMessage(msg);
        }
        // mengembalikan nilai error dengan memanggil method getErrorMessage di class form
        return super.getErrorMessage().isEmpty();
    }

    @Override
    public void reset() {
        kip = null;
    }
    
    @Override
    public void save(){
    }
    
}