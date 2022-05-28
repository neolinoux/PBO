/*
Kelompok 05
1. Akhir Mubarok	            222011698
2. Avelia Deavy Putri Primadani	222011655
3. I Made Satria Ambara Putra	222011635
4. Mohammad Fikri Syams	        222011546
5. Randi Qodri .P	            222011549
*/
package KelLimaDPP;
public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);        
        Kuesioner q1 = new Kuesioner();
        q1.setProvinsi("Jakarta");
        q1.setKabupaten("Jakarta Timur");
        q1.setPeriode("Januari 2022");
        q1.setKodeKabupaten(10);
        q1.setKodeProvinsi(31);
        q1.setTahunPeriode(2020);
        
        Perusahaan perusahaan1 = new Perusahaan();
        Perusahaan perusahaan2 = new Perusahaan();
        
        FormPerusahaan fp = new FormPerusahaan();
        
        perusahaan1.setNama("PT Maju");
        perusahaan1.setAlamat("otista");
        perusahaan1.setBadanHukum(1);
        perusahaan1.setTelp("0123456789");
        perusahaan1.setFaksimili("0123456789");
        perusahaan1.setUsahaUtama("3c");
        perusahaan1.getKip().setKodProv(31);
        perusahaan1.getKip().setKodKab(1);
        perusahaan1.getKip().setKodKec(17);
        perusahaan1.getKip().setKodKJU(22);
        perusahaan1.getKip().setNoUrut(2);
        perusahaan1.getDppPerusahaan().setStatus(3);
        perusahaan1.getDppPerusahaan().setKonfirmasiKeberadaan(0);
        perusahaan1.getSubsektorPerusahaan().setHortikultura(0);
        perusahaan1.getSubsektorPerusahaan().setKehutanan(0);
        perusahaan1.getSubsektorPerusahaan().setPerikanan(0);
        perusahaan1.getSubsektorPerusahaan().setPerkebunan("3c");
        perusahaan1.getSubsektorPerusahaan().setPeternakan(0);
        perusahaan1.getSubsektorPerusahaan().setTanamanPangan(0);
        
        perusahaan2.setNama("PT Mundur");
        perusahaan2.setAlamat("o00");
        perusahaan2.setBadanHukum(0);
        perusahaan2.setTelp("0123");
        perusahaan2.setFaksimili("0123456789");
        perusahaan2.setUsahaUtama("3c");
        perusahaan2.getKip().setKodProv(31);
        perusahaan2.getKip().setKodKab(1);
        perusahaan2.getKip().setKodKec(17);
        perusahaan2.getKip().setKodKJU(22);
        perusahaan2.getKip().setNoUrut(4);
        perusahaan2.getDppPerusahaan().setStatus(3);
        perusahaan2.getDppPerusahaan().setKonfirmasiKeberadaan(1);
        perusahaan2.getSubsektorPerusahaan().setHortikultura(1);
        perusahaan2.getSubsektorPerusahaan().setKehutanan(1);
        perusahaan2.getSubsektorPerusahaan().setPerikanan(1);
        perusahaan2.getSubsektorPerusahaan().setPerkebunan("9c");
        perusahaan2.getSubsektorPerusahaan().setPeternakan(1);
        perusahaan2.getSubsektorPerusahaan().setTanamanPangan(1);
        
        fp.setPerusahaan(perusahaan1);
        System.out.println();
        //fp.reset();
        //System.out.println();
        q1.addPerusahaan(fp);
        System.out.println();
        q1.save();
        System.out.println();
        fp.setPerusahaan(perusahaan2);
        System.out.println();
        q1.addPerusahaan(fp);
        // System.out.println();
        // q1.save();
        // System.out.println();
    }
    
}