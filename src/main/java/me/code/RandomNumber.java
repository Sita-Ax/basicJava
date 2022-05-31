package me.code;

import java.util.Scanner;

public class RandomNumber {
    Scanner scan = new Scanner(System.in);
    int rNr = 1 + (int) (100 * Math.random());
    int guessNr, i;
    int count = 0;
    int guesses = 3;
    public void guess() {
        System.out.println("Enter a random number between 1-500.");
        System.out.println("Choose 1 to play with 3 trials. ");
        System.out.println("Choose 2 to guess until you have the right number. ");

        int menu = scan.nextInt();

        switch (menu) {
            case 1 -> trials();
            case 2 -> guessNumber();
            default -> {
            }
        }


    }

    public void trials() {
        System.out.println("Enter a random number between 1-500. You have 3 trials. ");
        for (i = 0; i < guesses; i++) {
            System.out.println("Guess the number: ");
            guessNr = scan.nextInt();
            if (rNr == guessNr) {
                System.out.println("You guess the number! ");
            } else if (rNr < guessNr && i != guesses - 1) {
                System.out.println("To big! " + guessNr + " was your number.");
            } else if (rNr > guessNr && i != guesses - 1) {
                System.out.println("To small! " + guessNr + " was your number.");
            }
        }
        if (i == guesses) {
            System.out.println("No more trials. The number was: " + rNr);
        }
    }
    public void guessNumber() {
        System.out.println("Enter a random number between 1-500. ");
        do {
            System.out.println("Guess the number: ");
            guessNr = scan.nextInt();
            if (rNr == guessNr) {
                System.out.println("You guess the number! ");
                System.out.println("You tried " + count + " times to get the random number!");
            } else if (rNr < guessNr) {
                System.out.println("To big! " + guessNr + " was your number.");
                count ++;
            } else if (rNr > guessNr) {
                System.out.println("To small! " + guessNr + " was your number.");
                count ++;
            }
        }
        while (guessNr != rNr);
    }
}
