package me.code;

import java.util.Scanner;

public class InputName {

    public void inputName() {

        String name;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username: ");
        name = scan.nextLine();
        System.out.println("Hello " + name);
    }
}
