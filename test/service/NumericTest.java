package service;

import com.core.shibaev.first.exeption.CustomExeption;
import com.core.shibaev.first.service.NumericService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class NumericTest {
    NumericService numericService = new NumericService();
    @Test
    public void numPerfectTest() throws CustomExeption {
        int num = 6;
        assertTrue(numericService.isNumPerfect(num));
    }
    @Test
    public void numPerfectFalseTest() throws CustomExeption {
        int num = 3;
        assertFalse(numericService.isNumPerfect(num));
    }
    @Test(enabled = true, expectedExceptions = CustomExeption.class, expectedExceptionsMessageRegExp = "Wrong input")
    public void numNotNatural() throws CustomExeption{
        int num = -1;
        numericService.isNumPerfect(num);
    }



    @Test
    public  void divisionSquareTest(){
        double num = 12321.41d;
        double actual = numericService.calculateDivisionSquare(num);
        double expected = 1;
        assertEquals(actual,expected);
    }
    @Test(dataProvider = "even_mass")
    public void massEvenTest(double[] mas) {
        assertTrue(numericService.isMassEven(mas));
    }
    @Test(dataProvider = "odd_mass")
    public void massEvenFalseTest(double[] mas) {
        assertFalse(numericService.isMassEven(mas));
    }
    @DataProvider(name = "even_mass")
    public Object[][] evenMassData()
    {
        return new Object[][]{{2,4,6,9},{2,8,5,3}};
    }
    @DataProvider(name = "odd_mass")
    public Object[][]  oddMassData()
    {
        return new Object[][]{{1,3,6,9},{1,8,5,3}};
    }

}
