/*
Kelompok 05
1. Akhir Mubarok	            222011698
2. Avelia Deavy Putri Primadani	222011655
3. I Made Satria Ambara Putra	222011635
4. Mohammad Fikri Syams	        222011546
5. Randi Qodri .P	            222011549
*/
package KelLimaDPP;
public class FormPerusahaan extends Form{
    Perusahaan perusahaan;
    FormKIP formKIP;
    FormDPP formDPP;
    FormSubsektor formSubsektor;

    //Membentuk Objek Form Perusahaan(Constructor FormPerusahaan)
    public FormPerusahaan() {
    }

    public Perusahaan getPerusahaan() {
        return perusahaan;
    }

    //Men-set Perusahan mengeksekusi bagaimana jika perusahaan null ataupun tidak null
    public void setPerusahaan(Perusahaan perusahaan) {
        try{
            if(perusahaan!=null){
                System.out.println("Perusahaan berhasil di set");
                super.getErrorMessage().clear();
                this.perusahaan = perusahaan;
                this.formKIP = new FormKIP();
                this.formDPP = new FormDPP();
                this.formSubsektor = new FormSubsektor();
                this.formKIP.setKip(perusahaan.getKip());
                this.formDPP.setDpp(perusahaan.getDppPerusahaan());
                this.formSubsektor.setSubsektor(perusahaan.getSubsektorPerusahaan());
            }
            else{
                throw new Exception("Tidak boleh null ");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    //fungsi reset untuk mereset perusahaan
    @Override
    public void reset() {
        System.out.println("Perusahaan berhasil di reset");
        perusahaan = null;
    }

    @Override
    //Fungsi validate untuk mengeksekusi error akibat salah input
    public boolean validate() {
        if(perusahaan == null){
            String msg = "Invalid Perusahaan : perusahaan tidak ada";
            super.addErrorMessage(msg);
            return false;
        }
        formKIP.validate();
        formDPP.validate();
        formSubsektor.validate();
        if(!perusahaan.getTelp().startsWith("0")){
            String msg = "Invalid Nomor Telepon Perusahaan : nomor telepon harus dimulai dari 0";
            super.addErrorMessage(msg);
        }
        if(perusahaan.getTelp().length()!=10){
            String msg = "Invalid Nomor Telepon Perusahaan : nomor telepon perusahaan harus 10 digit";
            super.addErrorMessage(msg);
        }
        if(!perusahaan.getFaksimili().startsWith("0")){
            String msg = "Invalid Nomor Faksimili Perusahaan : nomor faksimili harus dimulai dari 0";
            super.addErrorMessage(msg);
        }
        if(perusahaan.getFaksimili().length()!=10){
            String msg = "Invalid Nomor Faksimili Perusahaan : nomor faksimili perusahaan harus 10 digit";
            super.addErrorMessage(msg);
        }
        if(perusahaan.getBadanHukum()<0||perusahaan.getBadanHukum()>10){
            String msg = "Invalid Badan Hukum Perusahaan  : Badan Hukum perusahaan harus berada pada kode 1-10";
            super.addErrorMessage(msg);
        }
        if(perusahaan.getUsahaUtama() == null||perusahaan.getUsahaUtama().equals("")){
            String msg = "Invalid Usaha Utama Perusahaan : Usaha utama tidak boleh kosong";
            super.addErrorMessage(msg);
        }
        if(!(perusahaan.getUsahaUtama() == null||perusahaan.getUsahaUtama().equals(""))){
            boolean cekUsaha = false;
            for(int i=0;i<Perusahaan.getArrUsahaUtama().length;i++){
                if(perusahaan.getUsahaUtama().equals(Perusahaan.getArrUsahaUtama()[i])){
                    cekUsaha = true;
                    break;
                }
            }
            if(cekUsaha==false){
                String msg = "Invalid Usaha Utama Perusahaan : Usaha Utama tidak valid";
                super.addErrorMessage(msg);
            }
        }
        return super.getErrorMessage().isEmpty();
    }

    @Override
    public void save(){
    }
}