public class ruteLaut implements Rute {
    @Override
    public void jalan(String orang, String asal, String tujuan) {
        System.out.println(orang + " berangkat dari " + asal + " ke " + tujuan + " melalui laut");
    }
}
