public class App {
    public static void main(String[] args) {
        Orang orang = new Orang("Budi", new ruteDarat());
        Orang orang2 = new Orang("Agus", new ruteLaut());
        Orang orang3 = new Orang("Siti", new ruteUdara());

        orang.setAsal("Bandung");
        orang.setTujuan("Jakarta");
        orang.berangkat();
        orang.setRute(new ruteLaut());
        orang.berangkat();
        
        orang2.setAsal("Bandung");
        orang2.setTujuan("Jakarta");
        orang2.berangkat();
        
        orang3.setAsal("Bandung");
        orang3.setTujuan("Jakarta");
        orang3.berangkat();
    }
}
