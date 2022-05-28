// package bankaccount;

/**
 * Kumpulan class untuk simulasi Transaksi Keuangan
 * @author nanoy
 */


/**
 * interface transaksi keuangan
 */

/**
 * BankAccount Class 
 */
public class BankAccount implements ITransaksi {
    // composition
    private Bank bank;
    private String noRek; 
    private double saldo;
    // constructor
    public BankAccount(String namaBank, String kodeBank, double depositAwal,String namaNasabah) {
        this.bank = new Bank();
        this.bank.kodeBank = kodeBank;
        this.bank.namaBank = namaBank;
        this.noRek = this.bank.generateNoRek();
        this.saldo = depositAwal;        
    }

    /**
     * method tarikSaldo, jumlah uang pada akun bank bersangkutan akan berkurang
     * @param jumlahUang 
     */
    @Override
    public void tarikSaldo(double jumlahUang) {
        // TODO tarik Saldo
        //=============================
        // TAMBAHKAN KODE DISINI !!!
        //=============================
        if (this.saldo < jumlahUang) {
            System.out.println("Saldo tidak mencukupi");
        }else{
            this.saldo -= jumlahUang;
            System.out.println("Berhasil tarik dari rekening sejumlah : Rp." + jumlahUang );
        }
    }

    /**
     * method setor, jumlah uang pada akun bank bersangkutan akan bertambah
     * @param jumlahUang 
     */
    @Override
    public void setor(double jumlahUang) {
        // TODO setor
        //===========================================
        // TAMBAHKAN KODE DISINI !!
        //===========================================
        this.saldo += jumlahUang;
        System.out.println("Berhasil setor ke rekening sejumlah : Rp." + jumlahUang );
    }
    
    /**
     * Method transfer, saldo akunbank pengirim akan berkurang dan saldo akunbank penerima akan bertambah
     * sesuai jumlah uang yang ditransfer pada parameter.
     * @param jumlahUang
     * @param penerima
     * @param noRek 
     */
    @Override
    public void transfer(double jumlahUang,Person penerima, String noRek) {
        // TODO transfer
        // =====================================================
        // TAMBAHKAN KODE DISINI !!!
        // =====================================================
        if(this.saldo < jumlahUang){
            System.out.println("Saldo tidak mencukupi");
        } else {
            this.saldo -= jumlahUang;
            BankAccount akun = penerima.getAkunBank(noRek);
            akun.setor(jumlahUang);
            System.out.println("Transfer berhasil ke "+noRek+" a.n. "+penerima.getNama()+" sebesar Rp. "+ jumlahUang);
        }
    }
    
    public String getBank() {
        return bank.namaBank;
    }

    public String getNoRek() {
        return noRek;
    }

    public double getSaldo() {
        return saldo;
    }
}
