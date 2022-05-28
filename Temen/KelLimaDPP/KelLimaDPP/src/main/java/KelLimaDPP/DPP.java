/*
Kelompok 05
1. Akhir Mubarok	            222011698
2. Avelia Deavy Putri Primadani	222011655
3. I Made Satria Ambara Putra	222011635
4. Mohammad Fikri Syams	        222011546
5. Randi Qodri .P	            222011549
*/
package KelLimaDPP;
public class DPP {
    private int konfirmasiKeberadaan; 
    private int status;

    public String getKeteranganKonfirmasiKeberadaaan(){
        switch(this.konfirmasiKeberadaan){
            case 1 : 
                System.out.println("Sudah dikunjungi/ mendapatkan informasi dari pihak lain(dinas, dll");
                break;
            case 0 :
                System.out.println("Belum dikonfirmasi keberadaannya");
                break;
            default :
                System.out.println("Tidak terdaftar");
                break;
        }
        return "";
    }
    //fungsi getketerangankonfirmasikeberadaan digunakan untuk mengetahui penjelasan tentang nilai yang kita isi yaitu 0 dan 1
    
    public String getKeteranganStatus(){
        switch(this.status){
            case 1 : 
                System.out.println("Aktif");
                break;
            case 2 :
                System.out.println("Tutup Sementara/ Tidak Ada Kegiatan");
                break;
            case 3 :
                System.out.println("Belum Berproduksi");
                break;
            case 4 :
                System.out.println("Tidak Bersedia Diwawancarai");
                break;
            case 5 :
                System.out.println("Alih Usaha ke Non Pertanian");
                break;
            case 6 :
                System.out.println("Tutup");
                break;
            case 7 :
                System.out.println("Tidak Ditemukan");
                break;
            case 8 :
                System.out.println("Baru");
                break;
            case 9 :
                System.out.println("Ganda");
                break;
            default :
                System.out.println("Tidak terdaftar");
                break;
        }
        return "";
    }
    //fungsi getketeranganstatus digunakan untuk mengetahui penjelasan tentang nilai yang kita isi yaitu antara nilai 1-9
    
    public int getKonfirmasiKeberadaan() {
        return konfirmasiKeberadaan;
    }

    public void setKonfirmasiKeberadaan(int konfirmasiKeberadaan) {
        this.konfirmasiKeberadaan = konfirmasiKeberadaan;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public String toString(){
        return String.format("\nDPP[Konfirmasi Keberadaan : %s, "
                + "Status : %s]", this.getKeteranganKonfirmasiKeberadaaan(),this.getKeteranganStatus());
    }
    
}
