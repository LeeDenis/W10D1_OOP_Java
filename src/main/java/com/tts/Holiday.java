package com.tts;

public class Holiday {
    //private instance variables
    private static String holiday;
    private static String month;
    private static int day;
    private static boolean federal;

    //get method
    public static String getHoliday() {
        return holiday;
    }
    //set method
    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }

    public static String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }

    public static int getDay() {
        return day;
    }
    public void setLocation(int day) {
        this.day = day;
    }

    public static boolean getFederal() {
        return federal;
    }
    public void setFederal(boolean federal) {
        this.federal = federal;
    }

    public Holiday() {
        this.holiday = getHoliday();
        this.month = getMonth();
        this.day = getDay();
        this.federal = getFederal();
    }

}




