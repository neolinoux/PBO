package DecoratorPattern;

public class WarnaiMerah extends WarnaiPakaian {
    public WarnaiMerah(Pakaian warnai) {
        super(warnai);
    }
    
    @Override
    public void pakai() {
        warnai.pakai();
        setWarnaiPakaian(warnai);
    }

    private void setWarnaiPakaian(Pakaian warnai) {
        System.out.println("Warna Border : Merah");
    }
}