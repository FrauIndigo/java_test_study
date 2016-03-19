package task2;

/**
 * Created by админ1 on 22.02.2016.
 */
public class Point {

    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distanceTo(Point p2){
        return Math.sqrt(Math.pow((this.x-p2.getX()),2)+Math.pow((this.y-p2.getY()),2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
