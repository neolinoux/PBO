/**
 * interface transaksi keuangan
 */

interface ITransaksi {
    public void tarikSaldo(double jumlahUang);
    public void setor(double jumlahUang);
    public void transfer(double jumlahUang, Person p, String noRek);
}