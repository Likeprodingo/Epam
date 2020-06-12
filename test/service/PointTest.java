package service;

import com.core.shibaev.first.entety.Point;
import com.core.shibaev.first.service.PointService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class PointTest {
    PointService pointService = new PointService();
    @Test(dataProvider = "points")
    public void nearestPointTest(Point first, Point second, Point expected)
    {
       Point actual = pointService.calculateNearestPoint(first,second);
       assertEquals(actual,expected);
    }

    @DataProvider(name = "points")
    public Object[][] pointData()
    {
        return new Object[][]{
                {new Point(1,1),new Point(2,2),new Point(1,1)},
                {new Point(5,10), new Point(5,5), new Point (5,5)}
        };
    }


    @Test(dataProvider = "null_points")
    public void nullPointTest(Point first, Point second)
    {
        Point actual = pointService.calculateNearestPoint(first,second);
        assertNull(actual);
    }

    @DataProvider(name = "null_points")
    public Object[][] nullData()
    {
        return new Object[][]{
                {new Point(1,1),null},
                {null, new Point(5,5)},
                {null, null}
        };
    }

}
