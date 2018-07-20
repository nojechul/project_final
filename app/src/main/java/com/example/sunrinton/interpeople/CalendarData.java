package com.example.sunrinton.interpeople;

public class CalendarData {

    String date;
    String work;

    public CalendarData(String date, String work) {
        this.date = date;
        this.work = work;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}