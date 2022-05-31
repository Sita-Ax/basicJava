package me.code;

public class TimeCount {

    public void times(){
        int input = 86399;
        int seconds = input % 60;
        int minutes = input / 60 % 60;
        int hours = input / 3600;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
