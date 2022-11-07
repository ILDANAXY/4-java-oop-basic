package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public void setHours(int hours){
        if (hours >= 0)
            this.hours = hours;
    }
    public int getHours(){
        return hours;
    }

    public void setMinutes(int minutes){
        if (minutes >= 0){
            if (minutes < 60){
                this.minutes += minutes;
            }
            else {
                this.hours += minutes/60;
                this.minutes = minutes%60;
            }
        }
        else{
            this.hours--;
            minutes += 60;
        }
    }
    public int getMinutes(){
        return minutes;
    }

    public void setSeconds(int seconds){
        if (seconds >= 0){
            if (seconds < 60){
                this.seconds += seconds;
            }
            else {
                this.minutes += seconds/60;
                this.seconds = seconds%60;
            }
        }
        else {
            this.minutes--;
            seconds += 60;
        }
    }
    public int getSeconds(){
        return seconds;
    }

    public TimeSpan(int hours, int minutes, int seconds){
        if (seconds > 60){
            this.minutes += seconds / 60;
            this.seconds %= 60;
        }
        if (minutes > 60){
            this.hours += minutes / 60;
            this.minutes %= 60;
        }
        if (minutes < 60){
            this.hours--;
            minutes += 60;
        }
        if (seconds < 60){
            this.minutes--;
            seconds += 60;
        }
    }

    void add(TimeSpan time){
        hours = time.hours + time.getHours();
        minutes = time.minutes + time.getMinutes();
        seconds = time.seconds + time.getSeconds();
    }

    void subtract(TimeSpan time){
        hours = time.hours - time.getHours();
        minutes = time.minutes - time.getMinutes();
        seconds = time.seconds - time.getSeconds();
    }

    public String toString(){
        return hours + "hours, " + minutes + "minutes, " + seconds + "seconds";
    }
}
