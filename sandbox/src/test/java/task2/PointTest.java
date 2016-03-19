package task2;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by админ1 on 19.03.2016.
 */
public class PointTest {
    @Test
    public void distanceTest(){
        Point p1 = new Point(0,0);
        Point p2 = new Point (4,0);
        double d = p2.distanceTo(p1);
        Assert.assertEquals(d,4.0);

        Point p3 = new Point (0,3);
        Assert.assertEquals(p3.distanceTo(p1), 3.0);
        Assert.assertEquals(p3.distanceTo(p2), 5.0);
    }
}

