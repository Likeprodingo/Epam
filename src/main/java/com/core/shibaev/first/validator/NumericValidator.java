package com.core.shibaev.first.validator;

public class NumericValidator {
    public static boolean IsRadius(double numeric) {
        boolean result = true;
        if (numeric < 1 || numeric > 100) {
            result = false;
        }
        return result;
    }
    public static boolean IsArea(double numeric) {
        boolean result = true;
        if (numeric < 1 || numeric > 1000) {
            result = false;
        }
        return result;
    }
    public static boolean IsNatural(double numeric) {
        boolean result = true;
        if (numeric < 0 || numeric > 10000) {
            result = false;
        }
        return result;
    }
}
