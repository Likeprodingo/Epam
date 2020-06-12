package service;

import com.core.shibaev.first.entety.Day;
import com.core.shibaev.first.exeption.CustomExeption;
import com.core.shibaev.first.service.FunctionService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FunctionTest {
    FunctionService functionService = new FunctionService();
    @Test(dataProvider = "function_data")
    public void custonFucntionTest(double x,double expected) throws CustomExeption {
        double actual = functionService.customFlexFunction(x);
        assertEquals(actual,expected);
    }
    @DataProvider(name = "function_data")
    public Object[][] functionData()
    {
        return new Object[][]{{2,0.5d},{4,5}};
    }
    @Test(enabled = true, expectedExceptions = CustomExeption.class,expectedExceptionsMessageRegExp = "Infinity")
    public void customFunctionFailTest() throws CustomExeption {
        double actual = functionService.customFlexFunction(1.81712d);
    }
}
