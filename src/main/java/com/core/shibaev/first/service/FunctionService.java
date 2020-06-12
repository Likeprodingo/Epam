package com.core.shibaev.first.service;

import com.core.shibaev.first.exeption.CustomExeption;
import com.core.shibaev.first.validator.NumericValidator;

public class FunctionService {
    public double customFlexFunction(double x) throws CustomExeption {
        double result;
        try {
            result = x >= 3 ? -Math.pow(x, 2) + 3 * x + 9 : 1 / (Math.pow(x, 3) - 6);
        } catch (ArithmeticException e) {
            throw new CustomExeption("Infinity");
        }
        return result;
    }

}
