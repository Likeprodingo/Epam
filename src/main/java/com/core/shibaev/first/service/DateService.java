package com.core.shibaev.first.service;

import com.core.shibaev.first.entety.Day;
import com.core.shibaev.first.entety.Month;
import com.core.shibaev.first.exeption.CustomExeption;
import com.core.shibaev.first.validator.DateValidator;


public class DateService {
    public final static int SECONDS_IN_HOUR = 3600;
    public final static int SECONDS_IN_MINUTE = 60;
    public final static int MINUTES_IN_HOUR = 60;


    public int calculateDayNum(int monthIndex, int year) throws CustomExeption {
        Month month;

        int days;
        if (DateValidator.isMonth(monthIndex)) {
            month = Month.values()[monthIndex - 1];
            if (month == Month.FEBRUARY && DateValidator.isLeap(year)) {
                days = month.getDays() + 1;
            } else {
                days = month.getDays();
            }
            return days;
        } else {
            throw new CustomExeption("Wrong Input");
        }
    }

    public Day calculateTime(int seconds) {
        Day day = null;
        if (DateValidator.isSecondsNumCorrect(seconds)) {
            day = new Day(seconds / SECONDS_IN_HOUR,
                    (seconds / SECONDS_IN_MINUTE) % MINUTES_IN_HOUR,
                    seconds % SECONDS_IN_MINUTE);
        }
        return day;
    }
}
