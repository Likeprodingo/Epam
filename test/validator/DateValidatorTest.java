package validator;

import com.core.shibaev.first.validator.DateValidator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class DateValidatorTest {

    @Test(dataProvider = "seconds_positive_data")
    public void secondsPositiveTest(int seconds) {
        assertTrue(DateValidator.isSecondsNumCorrect(seconds));
    }

    @DataProvider(name = "seconds_positive_data")
    public Object[] secondsPositiveData() {
        return new Object[]{5, 1240, 230};
    }

    @Test(dataProvider = "seconds_negative_data")
    public void secondsNegativeTest(int seconds) {
        assertFalse(DateValidator.isSecondsNumCorrect(seconds));
    }

    @DataProvider(name = "seconds_negative_data")
    public Object[] secondsNegativeData() {
        return new Object[]{-5, 1111240};
    }

    @Test(dataProvider = "month_positive_data")
    public void monthPositiveTest(int month) {
        assertTrue(DateValidator.isMonth(month));
    }

    @DataProvider(name = "month_positive_data")
    public Object[] monthPositiveData() {
        return new Object[]{5, 12};
    }

    @Test(dataProvider = "month_negative_data")
    public void monthNegativeTest(int month) {
        assertFalse(DateValidator.isMonth(month));
    }

    @DataProvider(name = "month_negative_data")
    public Object[] monthNegativeData() {
        return new Object[]{0, 13,-1};
    }

    @Test(dataProvider = "year_positive_data")
    public void yearPositiveTest(int year) {
        assertTrue(DateValidator.isLeap(year));
    }

    @DataProvider(name = "year_positive_data")
    public Object[] yearPositiveData() {
        return new Object[]{2016, 2020};
    }

    @Test(dataProvider = "year_negative_data")
    public void yearNegativeTest(int year) {
        assertFalse(DateValidator.isLeap(year));
    }

    @DataProvider(name = "year_negative_data")
    public Object[] yearNegativeData() {
        return new Object[]{2013, 2001};
    }
}
