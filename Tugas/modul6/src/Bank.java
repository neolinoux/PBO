import java.util.Random;

/**
 * Class Bank
 * @author nanoy
 */
class Bank {
    public String namaBank;
    public String kodeBank;
    
    /** 
     * mengenerate dan mengembalikan nomor rekening bank .
     * panjang no.rekening HARUS 9 digit : (kode bank 3 digit + 6 digit).
     * 
     * @return nomorRekening dengan panjang 9 digit (String)
    */     
    public String generateNoRek() {
        // TODO generate random noRek
        //=========================================================
        // TAMBAHKAN KODE DISINI !!!
        //=========================================================
        Random random = new Random();
        String noRek;
        int number;

        number = random.nextInt(999999);
        noRek = kodeBank + String.format("%06d", number);
        return noRek; // ubah returnnya
    }
}
