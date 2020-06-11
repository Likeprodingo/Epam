package com.core.shibaev.first.service;

import com.core.shibaev.first.entety.Day;
import com.core.shibaev.first.entety.Month;
import com.core.shibaev.first.exeption.CustomExeption;
import com.core.shibaev.first.validator.DateValidator;
import com.core.shibaev.first.validator.DayValidator;
import com.core.shibaev.first.validator.NumericValidator;

public class DateService {
    public final static int SECONDS_IN_HOUR = 3600;
    public final static int SECONDS_IN_MINUTE = 60;
    public final static int MINUTES_IN_HOUR = 60;


    public int calculateDayNum(String monthIndex,String year) throws CustomExeption {
        Month month;
        int index;
        int days;
        if(DateValidator.isMonth(monthIndex) && NumericValidator.StringIsInt(year))
        {
            index =  Integer.parseInt(monthIndex);
            month = Month.values()[index-1];
            if(month==Month.FEBRUARY && DateValidator.isLeap(year))
            {
                days =  month.getDays()+1;
            }
            else
            {
                days = month.getDays();
            }
            return days;
        }
        else {
            throw new CustomExeption("Wrong Input");
        }
    }

    public Day calculateTime(String numOfSeconds) {
        Day day = null;
        int seconds;
        if (NumericValidator.StringIsInt(numOfSeconds) &&
                DayValidator.NumOfSecondsIsLessThanDayLength(Integer.parseInt(numOfSeconds))
        ) {
            seconds = Integer.parseInt(numOfSeconds);
            day = new Day(seconds / SECONDS_IN_HOUR,
                    (seconds / SECONDS_IN_MINUTE) % MINUTES_IN_HOUR,
                    seconds % SECONDS_IN_MINUTE);
        }
        return day;
    }
}
