package Tugas.modul2;

public class Circle extends Shape{
    double radius = 1.0;
    
    Circle(){
        super();
    }

    Circle(double radius){
        super();
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = radius*radius*3.14;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2*3.14*radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle : "+ "\nRadius : "+this.radius+"\nArea : "+this.getArea()+"\nPerimeter : "+this.getPerimeter();
    }
}
