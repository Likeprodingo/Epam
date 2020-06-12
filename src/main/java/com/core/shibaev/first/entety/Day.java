package com.core.shibaev.first.entety;


public class Day {
    private int hours;
    private int minutes;
    private int seconds;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Day{");
        sb.append("hours=").append(hours);
        sb.append(", minutes=").append(minutes);
        sb.append(", seconds=").append(seconds);
        sb.append('}');
        return sb.toString();
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Day day = (Day) o;

        if (hours != day.hours) return false;
        if (minutes != day.minutes) return false;
        return seconds == day.seconds;
    }

    @Override
    public int hashCode() {
        int result = hours;
        result = 31 * result + minutes;
        result = 31 * result + seconds;
        return result;
    }

    public int getSeconds() {
        return seconds;
    }

    public Day(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
}
