public class Cylinder{
    private double height;
    private Circletugas3 base;

    Cylinder(double height, Circletugas3 base) {
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder[height=" + height + ",base=" + base + "]";
    }
}

