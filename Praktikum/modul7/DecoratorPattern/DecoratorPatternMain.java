package DecoratorPattern;

public class DecoratorPatternMain {
    public static void main(String[] args) {
        Pakaian kaos = new Kaos();
        Pakaian kaosMerah = new WarnaiMerah(new Kaos());
        Pakaian celanaMerah = new WarnaiMerah(new Celana());

        System.out.println("Kaos belum diwarnai");
        kaos.pakai();

        System.out.println("\nKaos diwarnai dengan warnai merah");
        kaosMerah.pakai();

        System.out.println("\nCelana diwarnai dengan warnai merah");
        celanaMerah.pakai();
    }
}
