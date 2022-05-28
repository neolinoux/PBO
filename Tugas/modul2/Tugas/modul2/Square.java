package Tugas.modul2;

public class Square extends Rectangle{
    Square(){
        super();
    }

    Square(double side){
        super(side, side);
    }

    Square(double side, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.width = side;
        this.length = side;
    }

    public double getSide(){
        return this.width;
    }

    public void setSide(double side){
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        // TODO Auto-generated method stub
        this.width = side;
    }

    @Override
    public void setLength(double side){
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square : \n" + "Side : " + this.getSide() + "\nArea : " + this.getArea() + "\nPerimeter : " + this.getPerimeter();
    }
}
