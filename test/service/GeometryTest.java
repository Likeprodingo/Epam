package service;

import com.core.shibaev.first.entety.Circle;
import com.core.shibaev.first.exeption.CustomExeption;
import com.core.shibaev.first.service.GeometryService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GeometryTest {
    GeometryService geometryService = new GeometryService();

    @Test
    public void inscribedSquareTest() throws CustomExeption {
        double area = 3;
        double actual = geometryService.calculateInscribedSquare(area);
        double expected = 1.5;
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "fail_data", enabled = true, expectedExceptions = CustomExeption.class, expectedExceptionsMessageRegExp = "Wrong Input")
    public void inscribedSquareFailTest(double area) throws CustomExeption {
        double actual = geometryService.calculateInscribedSquare(area);
    }

    @DataProvider(name = "fail_data")
    public Object[] squareData() {
        return new Object[]{-1, 0, 10000000};
    }

    @Test(dataProvider = "fail_data", enabled = true, expectedExceptions = CustomExeption.class, expectedExceptionsMessageRegExp = "Wrong Input")
    public void circleFailTest(double r) throws CustomExeption {
        Circle actual = geometryService.calculateCircle(r);
    }

    @Test
    public void circleCalculateTest() throws CustomExeption {
        double radius = 5;
        Circle expected = new Circle(5,78.539815d,31.415926d);
        Circle actual = geometryService.calculateCircle(radius);
        assertEquals(actual,expected);
    }

}
