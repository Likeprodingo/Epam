package validator;

import com.core.shibaev.first.validator.DateValidator;
import com.core.shibaev.first.validator.NumericValidator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class NumericValidatorTest {
    @Test(dataProvider = "numeric_positive_data")
    public void radiusPositiveTest(double radius) {
        assertTrue(NumericValidator.IsRadius(radius));
    }

    @DataProvider(name = "numeric_positive_data")
    public Object[] radiusPositiveData() {
        return new Object[]{5, 99};
    }

    @Test(dataProvider = "numeric_negative_data")
    public void radiusNegativeTest(double radius) {
        assertFalse(NumericValidator.IsRadius(radius));
    }

    @DataProvider(name = "numeric_negative_data")
    public Object[] radiusNegativeData() {
        return new Object[]{-5, 1111240, 0.1d};
    }
    @Test(dataProvider = "numeric_positive_data")
    public void areaPositiveTest(double area) {
        assertTrue(NumericValidator.IsArea(area));
    }

    @Test(dataProvider = "numeric_negative_data")
    public void areaNegativeTest(double area) {
        assertFalse(NumericValidator.IsArea(area));
    }

    @Test(dataProvider = "numeric_positive_data")
    public void naturalPositiveTest(double num) {
        assertTrue(NumericValidator.IsArea(num));
    }

    @Test(dataProvider = "natural_negative_data")
    public void naturalNegativeTest(double num) {
        assertFalse(NumericValidator.IsArea(num));
    }
    @DataProvider(name = "natural_negative_data")
    public Object[] naturalNegativeData() {
        return new Object[]{-5, 1111240};
    }
}
