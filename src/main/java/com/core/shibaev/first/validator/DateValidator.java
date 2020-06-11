package com.core.shibaev.first.validator;

public class DateValidator {
    public static final int MONTH_NUM = 12;
    public final static int LEAP_YEAR = 2020;
    public final static int LEAP_DELTA = 4;

    public static boolean isMonth(String monthIndex) {
        boolean result = true;
        int index = 0;
        try {
            index = Integer.parseInt(monthIndex);
        } catch (NumberFormatException e) {
            result = false;
        }
        if (index <= 0 || index > MONTH_NUM) {
            result = false;
        }
        return result;
    }

    public static boolean isLeap(String year) {
        boolean result = false;
        int yearValue;
        try {
            yearValue = Integer.parseInt(year);
        } catch (NumberFormatException e) {
            return false;
        }
        if (Math.abs(yearValue - LEAP_YEAR) % 4 == 0) {
            result = true;
        }
        return result;
    }

}
