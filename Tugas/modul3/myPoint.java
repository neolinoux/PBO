public class myPoint {
    int x = 0, y = 0;
    
    myPoint(){
        x = 0;
        y = 0;
    }

    myPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    int getXY(){
        return x + y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    double distance(int x, int y){
        int distance = (int) Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return distance;
    }

    double distance(myPoint another){
        int distance = (int) Math.sqrt(Math.pow(another.x - this.x, 2) + Math.pow(another.y - this.y, 2));
        return distance;
    }

    double distance(){
        int distance = (int) Math.sqrt(Math.pow(0 - this.x, 2) + Math.pow(0 - this.y, 2));
        return distance;
    }

}
