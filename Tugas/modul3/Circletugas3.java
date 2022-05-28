public class Circletugas3 {
    private double radius;
    private String color;

    Circletugas3(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getRadius() {
        return null;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return null;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }

}
