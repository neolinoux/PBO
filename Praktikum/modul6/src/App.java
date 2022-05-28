package src;

import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) {
        Pegawai lutfi = new Pegawai();
        Pegawai rahma = new Pegawai();
        lutfi.setNama("Lutfi");
        lutfi.setTanggalLahir(new GregorianCalendar(1990, 1, 1));
        rahma.setNama("Rahma");
        rahma.setTanggalLahir(new GregorianCalendar(2001, 2, 1));

        System.out.println("Ada orang :");
        // System.out.println(lutfi.getNama() + " lahir pada " + lutfi.getTanggalLahir());
        // System.out.println(rahma.getNama() + " lahir pada " + rahma.getTanggalLahir());
        try{
            lutfi.validateTanggallahir();
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
