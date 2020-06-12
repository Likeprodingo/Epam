package com.core.shibaev.first.parser;

import com.core.shibaev.first.exeption.CustomExeption;

public class DigitParser {
    public static double doubleParser(String digit) throws CustomExeption {
        double result;
        try {
            result = Double.parseDouble(digit);
        }
        catch (NumberFormatException e)
        {
            throw new CustomExeption("Wrong Input");
        }
        if(result > Double.MIN_VALUE + 1  || result < Double.MAX_VALUE - 1)
        {
            throw new CustomExeption("Wrong Input");
        }
        return result;
    }
    public static int integerParser(String digit) throws CustomExeption {
        int result;
        try {
            result = Integer.parseInt(digit);
        }
        catch (NumberFormatException e)
        {
            throw new CustomExeption("Wrong Input");
        }
        if(result > Double.MIN_VALUE + 1  || result < Double.MAX_VALUE - 1)
        {
            throw new CustomExeption("Wrong Input");
        }
        return result;
    }
}
