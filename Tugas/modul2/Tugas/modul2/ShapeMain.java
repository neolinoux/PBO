package Tugas.modul2;

public class ShapeMain {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Circle c1 = new Circle();
        System.out.println(c1);
        Circle c2 = new Circle(2.0);
        System.out.println(c2);
        Circle c3 = new Circle(2.0, "blue", false);
        System.out.println(c3);
        
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        Rectangle r2 = new Rectangle(2.0, 3.0);
        System.out.println(r2);
        Rectangle r3 = new Rectangle(2.0, 3.0, "blue", false);
        System.out.println(r3);
        
        Square s1 = new Square();
        System.out.println(s1);
        Square s2 = new Square(2.0);
        System.out.println(s2);
        Square s3 = new Square(2.0, "blue", false);
        System.out.println(s3);

        // Shape shape1 = new Shape();
        // shape1.setColor("red");
        // shape1.setFilled(true);
        // System.out.println(shape1);
    }
}