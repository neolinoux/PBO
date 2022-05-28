/*
Kelompok 05
1. Akhir Mubarok	        222011698
2. Avelia Deavy Putri Primadani	222011655
3. I Made Satria Ambara Putra	222011635
4. Mohammad Fikri Syams	        222011546
5. Randi Qodri .P	        222011549
*/
package KelLimaDPP;
//Header dari Kuesioner DPP
import java.util.ArrayList;

public class Kuesioner extends Form{
    
    //Membuat sebuah objek Array List dengan nama 'dp' dengan tipe data 'Perusahaan' 
    private ArrayList<Perusahaan> dp = new ArrayList<>();
    private String provinsi, kabupaten, periode;
    private int kodeProvinsi, kodeKabupaten, tahunPeriode;

    //Membuat method addPerusahaan untuk menambahkan perusahaan.
    //Parameter method-nya adalah variabel 'fp' dengan tipe data 'FormPerusahaan' 
    public void addPerusahaan(FormPerusahaan fp){
        try{
            //Jika lolos validasi
            if(fp.validate()){
                System.out.println("Perusahaan sukses ditambahkan");
            }
            
            //Jika tidak lolos validasi
             else{
                throw new Exception("Tidak dapat menambah perusahaan karena beberapa error : ");
            }
            
            //Menambahkan perusahaan ke array list 'dp'
            dp.add(fp.getPerusahaan());
            
            //Menghapus semua data pada array list errormessage
            super.getErrorMessage().clear();
        
        } catch (Exception e){
            System.out.println(e.getMessage());
            //for each loop: loop melalui elemen dalam array getErrorMessage
            for(String err : super.getErrorMessage()){
                System.out.println("-"+err);
            }
        }
    }

    public ArrayList<Perusahaan> getDp() {
        return dp;
    }
    
    public String getProvinsi() {
        return provinsi;
    }
    
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKabupaten() {
        return kabupaten;
    }
    
    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public String getPeriode() {
        return periode;
    }
    
    public void setPeriode(String periode) {
        this.periode = periode;
    }
    
    public int getKodeProvinsi() {
        return kodeProvinsi;
    }

    public void setKodeProvinsi(int kodeProvinsi) {
        this.kodeProvinsi = kodeProvinsi;
    }

    public int getKodeKabupaten() {
        return kodeKabupaten;
    }
    
    public void setKodeKabupaten(int kodeKabupaten) {
        this.kodeKabupaten = kodeKabupaten;
    }

    public int getTahunPeriode() {
        return tahunPeriode;
    }

    public void setTahunPeriode(int tahunPeriode) {
        this.tahunPeriode = tahunPeriode;
    }
    
    public String toString(){
        String str = "";
        str=str+String.format("Kuesioner [Provinsi : %s,"
                            + "Kabupaten : %s,"
                            + "Periode : %s]\n",
                            getProvinsi(),
                            getKabupaten(),
                            getPeriode());
        
        for (int i=0; i<dp.size();i++){
            str=str+ (i+1) + ". " + dp.get(i).toString();
        }
        return str;
    }
    
    @Override
    public boolean validate(){
        if(this.provinsi == null){
            String msg = "Invalid provinsi : tidak boleh kosong";
            super.addErrorMessage(msg);
        }
        if(!this.provinsi.matches("[a-zA-Z ]+")){
            String msg = "Invalid provinsi : Nama Provinsi hanya boleh alphabetic";
            super.addErrorMessage(msg);
        }
        if(this.kabupaten == null){
            String msg = "Invalid kabupaten : tidak boleh kosong";
            super.addErrorMessage(msg);
        }
        if(!this.kabupaten.matches("[a-zA-Z ]+")){
            String msg = "Invalid kabupaten : Nama Kabupaten hanya boleh alphabetic";
            super.addErrorMessage(msg);
        }
        if(this.periode == null){
            String msg = "Invalid periode : tidak boleh kosong";
            super.addErrorMessage(msg);
        }
        if(this.kodeKabupaten<1||this.kodeKabupaten>99){
            String msg = "Invalid kode Kabupaten : tidak boleh kosong dan merupakan bilangan dua digit";
            super.addErrorMessage(msg);
        }
        if(this.kodeProvinsi<1||this.kodeProvinsi>99){
            String msg = "Invalid kode Provinsi : tidak boleh kosong dan merupakan bilangan dua digit";
            super.addErrorMessage(msg);
        }
        if(this.tahunPeriode==0){
            String msg = "Invalid tahun Periode : tidak boleh kosong";
            super.addErrorMessage(msg);
        }
        
        return super.getErrorMessage().isEmpty();
    }
    @Override
    public void reset(){
        this.provinsi = null;
        this.kabupaten = null;
        this.periode = null;
        this.kodeKabupaten= 0;
        this.kodeProvinsi=0;
        this.tahunPeriode=0;
        dp.clear();
        super.getErrorMessage().clear();
    }
    public Perusahaan getPerusahaan(String kip){
        for(Perusahaan perusahaan : dp){
            if(perusahaan.getKip().toString().equals(kip)){
                return perusahaan;
            }
        }
        return null;
    }
   
    @Override
    public void save() {
       try{
            if (validate()) {
                System.out.println("Berhasil tersimpan");
            }
            else{
                throw new Exception("Tidak dapat menyimpan karena beberapa error");
            }
            super.getErrorMessage().clear();
        } catch (Exception e){
            System.out.println(e.getMessage());
            for(String err : super.getErrorMessage()){
                System.out.println("-"+err);
            }
            
        }
    }    
      
}