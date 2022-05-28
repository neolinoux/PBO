package kellimadpp;
/**
 * Anggota Kelompok 5 2KS3:
 * Pandya Almastiana Alifka 222011620
 * Moch. Daffa' AlFaris     222011622
 * Rahmad Setiya Budi       222011623
 * Amanda Christina Saragih 222011650
 * Nur Aini Adilah          222011676
 */

public class MForm {
    public static void main(String[] args) {
        Perusahaan perusahaan = new Perusahaan();

        try {
            if (perusahaan != null) {
                perusahaan.kantorBPS = new KantorBPS();
                perusahaan.kip = new KIP();
                perusahaan.alamat = new Alamat();
                perusahaan.bentukBadanHukum = new BentukBadanHukum();
                perusahaan.dpp = new DPP();
                perusahaan.subsektor = new Subsektor();
                perusahaan.jenisUsahaUtama = new JenisUsahaUtama();
            }
            else {
                throw new Exception("Perusahaan tidak ditemukan");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        //MENGECEK PROGRAM VALIDASI
        // input data kantor BPS
        perusahaan.kantorBPS.setNamaJelasProv("yoi");
        perusahaan.kantorBPS.setNamaJelasKab("");
        perusahaan.kantorBPS.setNamaJelasPeriodeData("");
        perusahaan.kantorBPS.setKodeProv("00000");
        perusahaan.kantorBPS.setKodeKab("12121212");
        perusahaan.kantorBPS.setKodePeriodeData("");

        perusahaan.kip.setKodeProv("3112312");
        perusahaan.kip.setKodeKab("013123");
        perusahaan.kip.setKodeKec("01031231");
        perusahaan.kip.setKodeKJU("");
        perusahaan.kip.setNoUrut("");

        perusahaan.setNama("");

        perusahaan.telepon = "021-11231223456";
        perusahaan.faksimil = "";

        perusahaan.alamat.setProvinsi("DKI Jakartaaaa");
        perusahaan.alamat.setKabupatenKota("Jakarta Pus");
        perusahaan.alamat.setKecamatan("Kecamatan Cilandaka");
        perusahaan.alamat.setKelurahan("Kelurahan Cilandak Barate");
        perusahaan.alamat.setKodePos("12110123123");

        perusahaan.bentukBadanHukum.setKodeBadanHukum(19);

        perusahaan.dpp.setKolom12("022");// 0: belum dikonfirmasi 1: sudah dikunjungi
        perusahaan.dpp.setKolom13("93");// 1-9

        perusahaan.subsektor.setTanamanPangan("11");// 0-1
        perusahaan.subsektor.setHoltikultura("11");
        perusahaan.subsektor.setPerkebunan("3a1");
        perusahaan.subsektor.setPeternakan("01");
        perusahaan.subsektor.setKehutanan("01");
        perusahaan.subsektor.setPerikanan("01");

        perusahaan.jenisUsahaUtama.setJenisUsahaUtama("21"); // 1-2, 3a-3k, 4-6, 7a-7f, 8-11
        PerusahaanForm form = new PerusahaanForm(perusahaan);
        form.validate();
        
        System.out.println("==MENGECEK PROGRAM VALIDASI==\n");
        for (int i = 0; i < form.getErrorMessage().size(); i++) {
            System.out.println(form.getErrorMessage().get(i));
        }
        
        //CONTOH MENGGUNAKAN DATA VALID
        KantorBPS kantorBPS = new KantorBPS();
        kantorBPS.setNamaJelasProv("DKI Jakarta");
        kantorBPS.setNamaJelasKab("Jakarta Timur");
        kantorBPS.setNamaJelasPeriodeData("2022");
        kantorBPS.setKodeProv("31");
        kantorBPS.setKodeKab("75");
        kantorBPS.setKodePeriodeData("2022");
        
        Alamat alamat1 = new Alamat();
        alamat1.setProvinsi("DKI Jakarta");
        alamat1.setKabupatenKota("Jakarta Timur");
        alamat1.setKecamatan("Pulo Gadung");
        alamat1.setKelurahan("Pulo Gadung");
        alamat1.setKodePos("13260");
        alamat1.setNamaJalan("Perkantoran Pulomas Blok 2/16");
        
        KIP kip1 = new KIP();
        kip1.setKodeProv("31");
        kip1.setKodeKab("72");
        kip1.setKodeKec("020");
        kip1.setKodeKJU("2");
        kip1.setNoUrut("1");
        
        BentukBadanHukum badanHukum1 = new BentukBadanHukum();
        badanHukum1.setKodeBadanHukum(5);
        
        DPP dpp1 = new DPP();
        dpp1.setKolom12("1");
        dpp1.setKolom13("1");
        
        Subsektor subsektor1 = new Subsektor();
        subsektor1.setTanamanPangan("0");
        subsektor1.setHoltikultura("1");
        subsektor1.setPerkebunan("0");
        subsektor1.setPeternakan("0");
        subsektor1.setKehutanan("0");
        subsektor1.setPerikanan("0");
        
        JenisUsahaUtama juu1 = new JenisUsahaUtama();
        juu1.setJenisUsahaUtama("2");
        
        Perusahaan perusahaan1 = new Perusahaan(kantorBPS,"Ganesha Rattesko Prima",alamat1,kip1,
                                                "0214714403","0214714403",badanHukum1,dpp1,subsektor1,juu1);
        PerusahaanForm form1 = new PerusahaanForm(perusahaan1);
        
        System.out.println("\n\n=====CONTOH MENGGUNAKAN DATA VALID=====\n");
            if (form1.validate() == false ) {
              for (int i = 0; i < form1.getErrorMessage().size(); i++) {
                System.out.println(form1.getErrorMessage().get(i));
                }
            }
            else {
                System.out.println(perusahaan1);}
            
            
       //CONTOH MENGISI DATA TIDAK VALID      
        Alamat alamat2 = new Alamat();
        alamat2.setProvinsi("DKI Jakarta");
        alamat2.setKabupatenKota("Jakarta Timur");
        alamat2.setKecamatan("Jatinegara");
        alamat2.setKelurahan("Cipinang Besar Utara");
        alamat2.setKodePos("13410");
        alamat2.setNamaJalan("Jl. Bekasi Timur Raya No.136, RT.8/RW.9");
        
        KIP kip2 = new KIP();
        kip2.setKodeProv("31");
        kip2.setKodeKab("72");
        kip2.setKodeKec("1000");
        kip2.setKodeKJU("2");
        perusahaan.kip.setNoUrut("2");
        
        BentukBadanHukum badanHukum2 = new BentukBadanHukum();
        badanHukum2.setKodeBadanHukum(5);
        
        DPP dpp2 = new DPP();
        dpp2.setKolom12("");    //tidak valid karena dikosongkan
        dpp2.setKolom13("1");
        
        Subsektor subsektor2 = new Subsektor();
        subsektor2.setTanamanPangan("1");
        subsektor2.setHoltikultura("0");
        subsektor2.setPerkebunan("0");
        subsektor2.setPeternakan("0");
        subsektor2.setKehutanan("9"); //tidak valid karena isian bukan 0 atau 1
        subsektor2.setPerikanan("0");
        
        JenisUsahaUtama juu2 = new JenisUsahaUtama();
        juu2.setJenisUsahaUtama("3k");
                Perusahaan perusahaan2 = new Perusahaan(kantorBPS,"PT Sumber Roso Agromakmur",alamat2,kip2,
                                                "08118454163","0214714403",badanHukum2,dpp2,subsektor2,juu2);
        PerusahaanForm form2 = new PerusahaanForm(perusahaan2);
        
        System.out.println("\n\n=====CONTOH ISIAN DATA TIDAK VALID=====\n");
            if (form2.validate() == false ) {
              for (int i = 0; i < form2.getErrorMessage().size(); i++) {
                System.out.println(form2.getErrorMessage().get(i));
                }
            }
            else {
                System.out.println(perusahaan2);}
        
    }
}
