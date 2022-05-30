package me.code;

import java.util.Scanner;

public class Calculate {

    public void calculation(){
        int n1, n2, sum, multiply, divide, subtract;
        double x, y, z, average;
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose 1 to get the sum of two numbers");
        System.out.println("Choose 2 to multiply of two numbers");
        System.out.println("Choose 3 to divide two numbers");
        System.out.println("Choose 4 to subtract of two numbers");
        System.out.println("Choose 5 to get the average of tree numbers");
        int menu = scan.nextInt();

        switch (menu) {
            case 1 -> {
                System.out.println("Enter the first number: ");
                n1 = scan.nextInt();
                System.out.println("Enter the second number: ");
                n2 = scan.nextInt();
                sum = sum(n1, n2);
                System.out.println("The sum of the two numbers: " + sum);
            }
            case 2 -> {
                System.out.println("Enter the first number: ");
                n1 = scan.nextInt();
                System.out.println("Enter the second number: ");
                n2 = scan.nextInt();
                multiply = multiply(n1, n2);
                System.out.println("The answer is: " + multiply);
            }
            case 3 -> {
                System.out.println("Enter the first number: ");
                n1 = scan.nextInt();
                System.out.println("Enter the second number: ");
                n2 = scan.nextInt();
                divide = divide(n1, n2);
                System.out.println("The answer is: " + divide);
            }
            case 4 -> {
                System.out.println("Enter the first number: ");
                n1 = scan.nextInt();
                System.out.println("Enter the second number: ");
                n2 = scan.nextInt();
                subtract = subtract(n1, n2);
                System.out.println("The answer is: " + subtract);
            }
            case 5 -> {
                System.out.println("Enter the first number: ");
                x = scan.nextDouble();
                System.out.println("Enter the second number: ");
                y = scan.nextDouble();
                System.out.println("Enter the third number: ");
                z = scan.nextDouble();
                average = average(x, y, z);
                System.out.println("The answer is: " + average);
            }
            default -> {
            }
        }
    }

    public static int sum(int n1, int n2){
        return n1 + n2;
    }

    public static int multiply(int n1, int n2){
        return n1 * n2;
    }

    public static int divide(int n1, int n2){
        return n1 / n2;
    }

    public static int subtract(int n1, int n2){
        return n1 - n2;
    }

    public static double average(double x, double y, double z){
        return (x + y + z) / 3;
    }
}
