package me.code;

import java.util.Scanner;

public class Year {
    public void inputYear(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter what year you believe was the last leap-year: ");
        int guessYear = scan.nextInt();
        if(guessYear % 400 == 0 || (guessYear % 100 != 0 && guessYear % 4 == 0)){
            System.out.println(guessYear + " was your guess! It was right!");
        } else {
            System.out.println(guessYear + " was your guess! but it was wrong! ");
        }
    }
}
