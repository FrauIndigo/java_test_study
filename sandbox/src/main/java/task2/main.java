package task2;

/**
 * Created by админ1 on 22.02.2016.
 */
public class main {

    public static void main(String[] args){
        Point p1 = new Point(0,5);
        Point p2= new Point(0,0);
        System.out.println("Distance between " + p1 + " and "+p2+" is " + distance(p1,p2));
    }

    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow((p1.getX()-p2.getX()),2)+Math.pow((p1.getY()-p2.getY()),2));
    }
}
