package com.core.shibaev.first.service;

import com.core.shibaev.first.exeption.CustomExeption;
import com.core.shibaev.first.validator.NumericValidator;

public class FunctionService {
    public double customFlexFunction(String x) throws CustomExeption {
        double xValue;
        double result;
        if (NumericValidator.StringIsDouble(x)) {
            xValue = Double.parseDouble(x);
            try {
                result =  xValue >= 3 ? -Math.pow(xValue,2) + 3 * xValue + 9 : 1 / (Math.pow(xValue,3) - 6);
            }
            catch (ArithmeticException e)
            {
                throw new CustomExeption("Infinity");
            }
        }
        else
        {
            throw  new CustomExeption("WrongInput");
        }
        return result;
    }

}
