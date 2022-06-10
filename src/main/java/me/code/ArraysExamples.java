package me.code;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExamples {

    int[] numbers = new int[]{33,5,46,28,2,16};
    int[][] dimArr = new int[3][3]; //Array to Array = doubleArray
    double[] doubleNumbers = {1, 1.2, 1.8, 1.6};
    double aDouble[];   //Alternative way to create an Array variable but uses most in #C

    char[] chars = new char[5]; //just default junit
    char[] letters = {'J', 'A', 'V', 'A'};
    char[] multiLetters = new char[]{'J', 'A', 'V', 'A'};
    int[] interNumbers = new int[10];
    int[] integers;
    int[] num = {100, 200, 50, 9001, 10000, 1};
    char[][] board = new char[3][3];
    Scanner scan = new Scanner(System.in);

    void numberArrays(){
        System.out.println("NumberArrays: ");
        System.out.println("In my array i have: " + Arrays.toString(numbers));
        System.out.println("Array index of 3: " + numbers[2]);
        System.out.println("Array index of 2: " + numbers[1]);
        System.out.print("Prints out position 2 of numbers[1] then change this value to = 8: ");
        System.out.println(numbers[1] = 8);
        System.out.println("It`s the arrays position 1 (not 0) that we set the value to 8. In this we change the position number to the value we set" +
                " so now this array´s value actually is: " + Arrays.toString(numbers));
        System.out.println("Index 2 of double: " + doubleNumbers[1]);
        System.out.print("In the double Arrays is the value: " + Arrays.toString(doubleNumbers) + " then I set the 4 position to: ");
        System.out.println(doubleNumbers[3] = 1.2);
        System.out.println("In the double Arrays is the value: " + Arrays.toString(doubleNumbers));
        System.out.println("Index 0 on numbers and doubleNumbers array: " + numbers[0] + " : " + doubleNumbers[0]);
        System.out.println("Inside the numbers array it have: " + numbers.length + " positions and inside the double Array " +
                "it have: " + doubleNumbers.length + " positions!");
        int[][] a;
        System.out.println("When I create a int[][] a; it`s does`t have any value. ");
        a = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println("I set the value a = new int[][]{{1,2,3,4},{5,6,7,8}}; then I have: " + Arrays.deepToString(a) + " as value. ");
        System.out.println("This means that it`s: " + a.length + " double int arrays.");
        System.out.println("END: numberArrays! ");
    }

    void arrayNr(){
        System.out.println("ArrayNR: ");
        int[] numbers = new int[10];
        /*numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
         */
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
            System.out.println("Numbers Array of index " + i + " with value " + numbers[i]);
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Access how many index it contains and the value: " + numbers.length + " " + numbers[i]);
        }
        for(int numberInArray : numbers){
            System.out.println("Only access value no index " + numberInArray);
        }
        System.out.println(" END of ArrayNR! ");
    }

    void iterationNumbers(){
        System.out.println("IterationNumbers: ");
        for(int i = 0; i < interNumbers.length; i++){
            interNumbers[i] = i + 1;
        }
        System.out.println("This iteration has: " + interNumbers.length + " but no value!");
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Just test the chars: " + Arrays.toString(chars) + " Has INDEX -> 0,1,2,3,4");
        System.out.println("Index chars: " + chars[2]);
        System.out.println("#C double is a null value: " + Arrays.toString(aDouble));
        System.out.println("integers is a null value: " + Arrays.toString(integers));
        System.out.println("letters: " + Arrays.toString(letters));
        System.out.println("Index letters of position 2: " + letters[1]);
        System.out.println("multiLetters: " + Arrays.toString(multiLetters));
        System.out.println("Index multiLetters of position 3: " + multiLetters[2]);
        System.out.println("num: " + Arrays.toString(num));
        System.out.println("Index of num position 3: " + num[2]);
        System.out.println("END of IterationNumbers");
    }

    void dimArray(){
        System.out.println("DimArray: ");
        for(int i = 0; i < dimArr.length; i++){
            int count = 0;
            for(int j = 0; j < dimArr.length; j++){
                if(j == dimArr[i].length -1){
                    System.out.println(" This is always null! ");
                }
                System.out.println(dimArr[i][j] + " dimArr counts every time it goes thru the positions so it is: " + count++ + " but have: " + dimArr.length + " values in.");
            }
            System.out.println("This will always be an array with: " + Arrays.toString(dimArr[i]) + " but in the loop it goes counting up to: " + count + " because this array contains 3 ints to 3 arrays " + Arrays.deepToString(dimArr));
        }
        System.out.println(dimArr.length + " is number of this array. ");
        System.out.println("END of dimArray! ");
    }

    void dimArrays(){
        System.out.println("DimArrays: ");
        //int[][] multiArrays = new int[3][3];

        //how many clusters then how many values
        //multiArrays[0][0] = 1;
        //multiArrays[0][1] = 10;
        //multiArrays[0][2] = 100;

        //multiArrays[1][0] = 2;
        //multiArrays[1][1] = 20;
        //multiArrays[1][2] = 200;

        //multiArrays[2][0] = 3;
        //multiArrays[2][1] = 30;
        //multiArrays[2][2] = 300;
        int count = 0;
        int[][] multiArrays = {{1,2,3},{4,5,6},{7,8,9,13},{10,11,12}};

        for(int i = 0; i < multiArrays.length; i++){
            count++;
            System.out.println(count + " Looking of length of the first part of the array: " + Arrays.toString(multiArrays[i]));
            for(int j = 0; j < multiArrays[i].length; j++){
                count++;
                System.out.println(count + " Looking into the array that has: " + Arrays.toString(multiArrays[j]));
                System.out.print(multiArrays[i][j] + " ");
            }
            count++;
            System.out.println(" ");
            System.out.println("Loop count: " + count);
        }
        System.out.println("END of dimArrays! ");
    }

    void dimArrayValues(){
        System.out.println("DimArrayValues: ");
        int[][] dimArr;
        dimArr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int count = 0;
        for (int[] ints : dimArr) {
            for (int j = 0; j < dimArr.length; j++) {
                count++;
                System.out.println(ints[j] + " is the int value inside but in the " + count + " position. ");
            }
            System.out.println("This will be the array and in the " + count + " loop it contains: " + Arrays.toString(ints) + " as value. " +
                    "Because this array contains 3 ints to 3 arrays " + Arrays.deepToString(dimArr));
        }
        System.out.println(dimArr.length  + " is length of this array. " +
                " The first: " + Arrays.toString(dimArr[0]) + " The second: " + Arrays.toString(dimArr[1]) + " The third: " + Arrays.toString(dimArr[2]));
        System.out.println("END of dimArrayValues! ");
    }



    void ticTacToe(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = '-';
            }
        }
        System.out.println("Tic Tac Toe! ");
        System.out.print("Make Player 1´s name: ");
        String Player1 = scan.nextLine();
        System.out.print("Make Player 2´s name: ");
        String Player2 = scan.nextLine();
        boolean draw = true;
        boolean checkGameEnd = false;
        while(!checkGameEnd){
            drawBoard(board);
            if(draw){
                System.out.print(Player1 + "`s Turn that draws (X): ");
            }else{
                System.out.print(Player2 + "`s Turn that draws (0): ");
            }
            char c = '-';
            if(draw){
                c = 'X';
            }else{
                c = '0';
            }
            int rowPosition = 0;
            int columnPosition = 0;

            while (true){
                System.out.print("Enter a row position number (0, 1, or 2): ");
                rowPosition = scan.nextInt();
                System.out.print("Enter a column position number (0, 1, or 2): ");
                columnPosition = scan.nextInt();

                if(rowPosition < 0 || columnPosition < 0 || rowPosition > 2 || columnPosition > 2){
                    System.out.println("Not in bounds of the board!");
                } else if (board[rowPosition][columnPosition] != '-') {
                    System.out.println("Already a value in this position");
                }else{
                    break;
                }
            }
            board[rowPosition][columnPosition] = c;
            if(playerWon(board) == 'X'){
                checkGameEnd = true;
                System.out.println(Player1 + " has won!");

            } else if (playerWon(board) == '0') {
                checkGameEnd = true;
                System.out.println(Player2 + " has won!");

            }else{
                if(boardFull(board)){
                    System.out.println("It´s a tie!");
                    checkGameEnd = true;
                } else {
                    draw = !draw;
                }
            }
        }
        drawBoard(board);
    }

    private boolean boardFull(char[][] board) {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[i][j] == '-'){
                    return false;
                }
            }
        }
        return true;
    }

    private char playerWon(char[][] board) {
        for(int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return board[i][0];
            }
        }
        for(int j = 0; j < 3; j++){
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
                return board[0][j];
            }
        }

        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-'){
            return board[0][0];
        }
        if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-'){
            return board[2][0];
        }
        return ' ';
    }

    private void drawBoard(char[][] board) {
        System.out.println("Board:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
