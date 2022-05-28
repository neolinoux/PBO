public class MovableTest {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(10, 7, 3, 5);
        point.toString();
        System.out.println("Point     : " + point);
        point.moveUp();
        System.out.println("Point     : " + point);
        point.moveDown();
        System.out.println("Point     : " + point);
        point.moveLeft();
        System.out.println("Point     : " + point);
        point.moveRight();
        System.out.println("Point     : " + point);

        MovableCircle circle = new MovableCircle(10, 7, 3, 5, 6);
        circle.toString();
        System.out.println("Circle    : " + circle);
        circle.moveUp();
        System.out.println("Circle    : " + circle);
        circle.moveDown();
        System.out.println("Circle    : " + circle);
        circle.moveLeft();
        System.out.println("Circle    : " + circle);
        circle.moveRight();
        System.out.println("Circle    : " + circle);
        
        MovableRectangle rectangle = new MovableRectangle(10, 7, 3, 20, 5, 11);
        System.out.println("Rectangle : " + rectangle);
        rectangle.moveUp();
        System.out.println("Rectangle : " + rectangle);
        rectangle.moveDown();
        System.out.println("Rectangle : " + rectangle);
        rectangle.moveLeft();
        System.out.println("Rectangle : " + rectangle);
        rectangle.moveRight();
        System.out.println("Rectangle : " + rectangle);
    }
}
