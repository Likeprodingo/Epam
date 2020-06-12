package service;

import com.core.shibaev.first.entety.Day;
import com.core.shibaev.first.exeption.CustomExeption;
import com.core.shibaev.first.service.DateService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class DateTest {
    DateService dateService = new DateService();

    @Test
    public void convertSecondsTest() {
        int seconds = 3600;
        Day actual = dateService.calculateTime(seconds);
        assertEquals(actual, new Day(1, 0, 0));
    }

    @Test(dataProvider = "null_test_data")
    public void convertSecondNullTest(int seconds) {
        Day actual = dateService.calculateTime(seconds);
        assertNull(actual);
    }

    @DataProvider(name = "null_test_data")
    public Object[] secondsNullTestData() {
        return new Object[]{-1, 89000};
    }

    @Test(enabled = true, expectedExceptions = CustomExeption.class, expectedExceptionsMessageRegExp = "Wrong Input")
    public void dayNumFailTest() throws CustomExeption {
        int month = 15;
        int year = 2010;
        dateService.calculateDayNum(month, year);
    }

    @DataProvider(name = "day_data")
    public Object[][] dayNumData() {

        return new Object[][]{{12, 2010, 31}, {2, 2020, 29}, {6, 2019, 30}};
    }

    @Test(dataProvider = "day_data")
    public void dayNumTest(int month, int year, int expected) throws CustomExeption {
        int actual = dateService.calculateDayNum(month, year);
        assertEquals(actual, expected);

    }


}
