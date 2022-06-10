package me.code;

import java.util.Scanner;

public class LoopsExamples {

    int[] numbers = {11,4,7,15,12,9,3};
    int max = 0;

    void increment(){
        System.out.println("Increment: ");
        for(int i = 0; i <= 10; i++){
            System.out.print(i + " ");
            System.out.println(" ");
        }
    }

    void decrement(){
        System.out.println("Decrement: ");
        for(int i = 100; i > 0; i--){
            System.out.print(i + " ");
            System.out.println(" ");
        }
    }

    void oddOrEven(){
        for(int i = 1; i <= 6; i++){
            if(i % 2 == 0){
                System.out.println("Even: " + i);
            }else{
                System.out.println("Odd: " + i);
            }
        }
    }

    void numberArr(){
        for(int i = 0; i < numbers.length; i++){
            System.out.println("NumberArray " + numbers[i]);
        }
    }

    void numArrForEach(){
        for(int number : numbers){
            System.out.println("Extract out to show the Enhanced for loop: " + number);
        }
    }

    void continueLoop(){
        for(int i = 0; i <= 10; i++){
            System.out.println("Continue! " + i);
        }
    }
    void whileLoopBreak(){
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Break to show! Age?: ");
            int age = scan.nextInt();
            if(age >= 18){
                System.out.println("You are adult!");
            }else{
                System.out.println("You are a child!");
                break;
            }
        }
    }

    void whileLoop(){
        Scanner scan = new Scanner(System.in);
        boolean isAdult = true;

        while(isAdult){
            System.out.println("Is Adult? Age?: ");
            int age = scan.nextInt();
            if(age >= 18){
                System.out.println("You are adult!");
            }else{
                System.out.println("You are a child!");
                isAdult = false;
            }
        }
    }

}
