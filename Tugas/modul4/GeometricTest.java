public class GeometricTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle: " + circle);
        System.out.println("Circle's perimeter: " + circle.getPerimeter());
        System.out.println("Circle's area: " + circle.getArea());

        ResizeableCircle resizeableCircle = new ResizeableCircle(5);
        System.out.println("ResizeableCircle\t\t\t\t: " + resizeableCircle);
        System.out.println("ResizeableCircle's perimeter\t\t\t: " + resizeableCircle.getPerimeter());
        System.out.println("ResizeableCircle's area\t\t\t\t: " + resizeableCircle.getArea());
        resizeableCircle.resize(40);
        System.out.println("ResizeableCircle after resize\t\t\t: " + resizeableCircle);
        System.out.println("ResizeableCircle's perimeter after resize\t: " + resizeableCircle.getPerimeter());
        System.out.println("ResizeableCircle's area after resize\t\t: " + resizeableCircle.getArea());
        resizeableCircle.resize(20);
        System.out.println("ResizeableCircle after resize\t\t\t: " + resizeableCircle);
        System.out.println("ResizeableCircle's perimeter after resize\t: " + resizeableCircle.getPerimeter());
        System.out.println("ResizeableCircle's area after resize\t\t: " + resizeableCircle.getArea());
    }
}
