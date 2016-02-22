package task2;

/**
 * Created by админ1 on 22.02.2016.
 */
public class main {

    public static void main(String[] args){
        Point p1 = new Point(0,5);
        Point p2= new Point(0,0);
        System.out.println("Distance between " + p1 + " and "+p2+" is " + p1.distanceTo(p2));
        System.out.println("Distance between " + p1 + " and "+p2+" is " + p2.distanceTo(p1));
        Point p3 = new Point(0,3);
        Point p4= new Point(4,0);
        System.out.println("Distance between " + p3 + " and "+p4+" is " + p3.distanceTo(p4));
    }

}
