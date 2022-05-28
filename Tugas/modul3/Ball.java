public class Ball{
    private float x, y, radius;
    private float dx, dy;

    Ball(float x, float y, float radius, float dx, float dy){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.dx = dx;
        this.dy = dy;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getDx() {
        return dx;
    }

    public void setDx(float dx) {
        this.dx = dx;
    }

    public float getDy() {
        return dy;
    }

    public void setDy(float dy) {
        this.dy = dy;
    }

    public void move(){
        x += dx;
        y += dy;
    }

    public void reflectorHorizontal(){
        dx = -dx;
    }

    public void reflectorVertical(){
        dy = -dy;
    }

    @Override
    public String toString() {
        return "Ball [(" + x + "," + y + ")" + ", speed=(" + dx + "," + dy + ")]";
    }
}

