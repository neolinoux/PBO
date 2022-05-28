import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Kantor {
    public static void main(String[] args) {
        Pegawai lutfi = new Pegawai();
        lutfi.setAlamat("Otista 64 C");
        System.out.println(lutfi.getAlamat());

        lutfi.setNIDN("123456789");
        lutfi.setKelompokKeahlian("Computer Science");
        System.out
                .println("ada dosen Lutfi dengan NIDN " + lutfi.getNIDN() + " kelompok " + lutfi.getKelompokKeahlian());
        // Orang lutfi= new Orang();
        // lutfi.setNama("Lutfi");
        // Orang rahma = new Orang("Rahma");
        // rahma.setTanggalLahir(new Date(2001-1900,10,10));
        // // rahma.setTanggalLahir(LocalDate.of(1996, 12, 12));

        // System.out.println("Ada orang: ");
        // System.out.println(lutfi.getNama() + " lahir pada " + lutfi.getTanggalLahir());
        // System.out.println(rahma.getNama() + " lahir pada " + rahma.getTanggalLahir());

        // Pegawai udin = new Pegawai("0101010101","Udin", "Kantor Pusat", "Pegawai");
        // Pegawai rahmaPegawai = new Pegawai("0101010101","Rahma", "Kantor Pusat", "Pegawai");
        // Pegawai tuti = new Pegawai("123456789","PT. ABC","Pemasaran","Tuti");
        // System.out.println(tuti.getNama() + " lahir pada "+ tuti.getTanggalLahir() + " NIP: " + tuti.getNIP() + " kantor: " + tuti.getNamaKantor() + " unit kerja: " + tuti.getUnitKerja());
        // rahma.getGaji();
        // tuti.getGaji();
        // System.out.print("Gaji orang Rahma : ");
        // rahma.getGaji();
        // System.out.print("Gaji orang Tuti : ");
        // tuti.getGaji();

        // List<Pegawai> daftarPegawai = new ArrayList<Pegawai>();
        // daftarPegawai.add(tuti);
        // daftarPegawai.add(udin);
        // daftarPegawai.add(rahmaPegawai);
        // unitKerja umum = new unitKerja("Umum", daftarPegawai);

        // Gedung STIS = new Gedung();
        // STIS.addRuang("kelas");
        // STIS.addRuang("lab");
        // STIS.addRuang("lapangan bola");
        // STIS.addRuang("lapangan basket");
        // STIS.addRuang("lapangan futsal");
        // STIS.addRuang("lapangan badminton");
        // STIS.addRuang("lapangan tenis");
        // STIS.addRuang("lapangan upacara");
        // STIS.addRuang("lapangan terbang");

        // List<Ruang> ruangan = STIS.getDaftarRuang();
        // for (Ruang ruang : ruangan) {
        //     System.out.println("Ruang : " + ruang.getNamaRuang());
        // }
    }
}
