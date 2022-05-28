import java.util.ArrayList;

class Person {
    // variables
    private String nama;
    private int umur;
    // array list akun bank (aggregation)
    private ArrayList<BankAccount> akunBank = new ArrayList<>();
    
    //constructor
    public Person (String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        System.out.println("Objek Person " + nama + " Tercipta!!!");
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
    
    // membuka akun bank baru untuk objek person 
    public void bukaAkunBank (String namaBank,String kodeBank,double setoranAwal) {
        akunBank.add(new BankAccount(namaBank, kodeBank, setoranAwal, this.nama));
        System.out.println(this.nama+ " ( Berhasil!!, Membuka Akun Bank " + namaBank + " Saldo awal : " + setoranAwal);
    }
        
    /**
     * mengembalikan akunBank dari objek person berdasarkan parameter noRekening.
     * @param noRekening (String)
     * @return Akun Bank (BankAccount)
     */
    public BankAccount getAkunBank(String noRekening){
        int idxAkun = 0;
        for (BankAccount akun:this.akunBank) {
            if (akun.getNoRek().equals(noRekening)) {
                    return this.akunBank.get(idxAkun);                
            }
            idxAkun++;
        }
        return null;
    }
    
    /**
     * Menampilkan daftar akun bank berupa no rekening dan nama bank dan saldo dari objek person.
     * ====== Daftar Rekening Bank [NAMA Objek Person] ========
     * 1. [BRI] [12312313] [Rp. xxxxx]
     * 2. [BCA] [********] [Rp. xxxxx]
     * 3.  ...
    */
    public void tampilListRekeningBank() {
        System.out.println("====== Daftar Rekening Bank " + this.nama+ " ========");
        // TODO list rekening bank
        //============================================================================
        // TAMBAHKAN KODE DISINI !!!
        //==========================================================================
        int idxAkun = 0;
        for (BankAccount akun : this.akunBank) {
            System.out.println(idxAkun + 1 + ". [" + akun.getBank() + "] [" + akun.getNoRek() + "] [" + akun.getSaldo() + "]");
            idxAkun++;
        }
        System.out.println("================================================ ");
    }
    
    /**
     * menghitung dan mengembalikan semua total saldo dari semua akunbank yg dimiliki objek person
     * @return rekapSaldo  
     */
    public double rekapSaldoRekening() {
        double rekapSaldo = 0;
        // TODO Rekap Saldo
        //==============================================================================
        // TAMBAHKAN KODE DISINI
        //==============================================================================
        for (BankAccount akun : this.akunBank) {
            rekapSaldo += akun.getSaldo();
        }
        System.out.println("Total Saldo Semua Rekening "+this.nama+ " : Rp." + rekapSaldo);
        return rekapSaldo;
    }
}