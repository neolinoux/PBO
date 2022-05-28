public class myPointTest {
    public static void main(String[] args) {
        myPoint point = new myPoint(0, 0);
        point.setX(0);
        point.setY(0);
        System.out.println("Point: " + point);
        System.out.println("Distance: " + point.distance());
        System.out.println("Distance: " + point.distance(10, 10));
        System.out.println("Distance: " + point.distance(new myPoint(0, 0)));
        System.out.println(point.toString());
    }
}
