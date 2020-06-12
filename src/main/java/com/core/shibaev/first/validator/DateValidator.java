package com.core.shibaev.first.validator;

public class DateValidator {
    public static final int MONTH_NUM = 12;
    public final static int LEAP_YEAR = 2020;
    public final static int LEAP_DELTA = 4;
    public static final int dayLength = 86400;

    public static boolean isSecondsNumCorrect(int seconds) {
        boolean result = true;
        if (seconds > dayLength || seconds < 0) {
            result = false;
        }
        return result;
    }
    public static boolean isMonth(int month) {
        boolean result = true;
        if (month <= 0 || month > MONTH_NUM) {
            result = false;
        }
        return result;
    }

    public static boolean isLeap(int year) {
        boolean result = false;

        if (Math.abs(year - LEAP_YEAR) % 4 == 0) {
            result = true;
        }
        return result;
    }

}
