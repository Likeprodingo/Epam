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

    public int getSeconds() {
        return seconds;
    }

    public Day(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
}
