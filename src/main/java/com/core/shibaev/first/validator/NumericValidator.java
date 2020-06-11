package com.core.shibaev.first.validator;

public class NumericValidator {
    public static boolean StringIsDouble(String value)
    {
        double numeric;
        try {
            numeric = Double.parseDouble(value);
            if(numeric>Double.MAX_VALUE-1 || numeric < Double.MIN_VALUE+1){

                return false;
            }
        }
        catch (NumberFormatException e)
        {
            return false;
        }
        return true;
    }
    public static boolean IsRadius(String value)
    {
        boolean result = true;
        double numeric;
        try {
            numeric = Double.parseDouble(value);
            if(numeric>Double.MAX_VALUE-1 || numeric < 0){
                result = false;
            }
        }
        catch (NumberFormatException e)
        {
            result = false;
        }
        return result;
    }
    public static boolean StringIsInt(String value)
    {
        int numeric;
        try {
            numeric = Integer.parseInt(value);
            if(numeric>Integer.MAX_VALUE-1 || numeric < Integer.MIN_VALUE+1){
                return false;
            }
        }
        catch (NumberFormatException e)
        {
            return false;
        }
        return true;
    }
}
