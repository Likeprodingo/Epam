package com.core.shibaev.first.validator;

public class DayValidator {
    private static final int dayLength = 86400;
    public static boolean NumOfSecondsIsLessThanDayLength(int seconds)
    {
        if(seconds>dayLength || seconds<0){
            return false;
        }
        else{
            return true;
        }
    }
}
