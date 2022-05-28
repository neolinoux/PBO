public class MovableRectangle implements Movable{
    MovablePoint topLeft;
    MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xspeed, int yspeed) {
        topLeft = new MovablePoint(x1, y1, xspeed, yspeed);
        bottomRight = new MovablePoint(x2, y2, xspeed, yspeed);
    }
        
    @Override
    public String toString() {
        return "MovableRectangle{" + "topLeft=" + topLeft + ", bottomRight=" + bottomRight + '}';
    }

    @Override
    public void moveUp() {
        // TODO Auto-generated method stub
        topLeft.moveUp();
    }

    @Override
    public void moveDown() {
        // TODO Auto-generated method stub
        topLeft.moveDown();
    }

    @Override
    public void moveLeft() {
        // TODO Auto-generated method stub
        topLeft.moveLeft();
    }

    @Override
    public void moveRight() {
        // TODO Auto-generated method stub
        topLeft.moveRight();
    }
    
}
