public class BallTest {
    public static void main(String[] args) {
        Ball bola = new Ball(0, 0, 10, 0, 0);
        bola.setX(0);
        bola.setY(0);
        bola.setRadius(10);
        bola.setDx(10);
        bola.setDy(10);
        bola.move();
        bola.reflectorHorizontal();
        bola.reflectorVertical();
        System.out.println(bola.toString());
    }
}
