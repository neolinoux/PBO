public class ResizeableCircle extends Circle implements Resizeable {
    public ResizeableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizeableCircle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void resize(double percent) {
        radius *= (percent/100);
    }
}