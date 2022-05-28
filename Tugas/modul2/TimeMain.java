package Tugas.modul2;

public class TimeMain {
    public static void main(String[] args) {
        Time time = new Time(23, 59, 59);
        System.out.println(time.toString());
        time.prevSecond();
        System.out.println(time.toString());
    }
}
