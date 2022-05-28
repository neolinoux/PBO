package Tugas.modul2;

public class Time {
    private int hour, minute, second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        if(hour < 0 || hour > 23) {
            if(hour < 0) {
                System.out.println("Invalid hour, reset to 0");
                this.hour = 0;
            } else {
                System.out.println("Invalid hour, reset to 23");
                this.hour = 23;
            }
        }
        if(minute < 0 || minute > 59) {
            if(minute < 0) {
                System.out.println("Invalid minute, reset to 0");
                this.minute = 0;
            } else {
                System.out.println("Invalid minute, reset to 59");
                this.minute = 59;
            }
        }
        if(second < 0 || second > 59) {
            if(second < 0) {
                System.out.println("Invalid second, reset to 0");
                this.second = 0;
            } else {
                System.out.println("Invalid second, reset to 59");
                this.second = 59;
            }
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int setHour(int hour) {
        return this.hour = hour;
    }

    public int setMinute(int minute) {
        return this.minute = minute;
    }

    public int setSecond(int second) {
        return this.second = second;
    }

    Time setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        return this;
    }

    @Override
    public String toString() {
        return this.hour+":"+this.minute+":"+this.second;
    }

    Time nextSecond(){
        if(setSecond(second+1) == 60) {
            setSecond(0);
            if(setMinute(minute+1) == 60) {
                setMinute(0);
                if(setHour(hour+1) == 24) {
                    setHour(0);
                }
            }
        }
        return setTime(hour, minute, second);
    }

    Time prevSecond(){
        if(setSecond(this.second-1) == -1){
            setSecond(59);
            if(setMinute(this.minute-1) == -1){
                setMinute(59);
                if(setHour(this.hour-1) == -1){
                    setHour(23);
                }
            }
        }
        return setTime(getHour(), getMinute(), getSecond());
    }
}
