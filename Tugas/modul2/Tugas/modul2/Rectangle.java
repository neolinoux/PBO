package Tugas.modul2;

public class Rectangle extends Shape{
    double width = 1.0;
    double length = 1.0;

    Rectangle(){
        super();
    }

    Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled){
        super();
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return 2*length+2*width;
    }

    @Override
    public String toString() {
        return "Rectangle : \n" + "Area : " + this.getArea() + "\nPerimeter : " + this.getPerimeter();
    }
}
