package me.code;

import java.util.Arrays;

public class ArrayExercise2 {

    public static void main(String[] args) {
        multiplication(table(10, 10));
    }
    int[] nr = {1,8,7,4};

    void expandArray(){
        System.out.println("9: --> Expand Array that have the length of: " + nr.length);
        System.out.println(Arrays.toString(nr));
        nr = Arrays.copyOf(nr, nr.length + 2);
        nr[nr.length -2] = 5;
        nr[nr.length -1] = 6;
        System.out.println("Is expand with 2 " + Arrays.toString(nr));
        Arrays.sort(nr);
        System.out.println("Sorted: " + Arrays.toString(nr));
        System.out.println("Now is this a length of: " + nr.length);
    }

    public static void multiplication(final int[][] table){
        System.out.println("10: --> Multi ");
        for(int r = 0; r < table.length; r++){
            for(int c = 0; c < table.length; c++){
                System.out.printf("%d\t", table[r][c]);
            }
            System.out.println();
        }

    }

    public static int[][] table(int rows, int colums){
        int [][] tableArr = new int[rows][colums];
        for(int r = 1; r <= rows; r++){
            for(int c = 1; c <= colums; c++){
                tableArr[r-1][c-1] = r * c;
            }
        }
        return tableArr;
    }


}
