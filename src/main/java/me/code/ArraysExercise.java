package me.code;

import java.util.Arrays;
import java.util.List;

public class ArraysExercise {

    int[] num = new int[]{11, 23, 39};
    int[] numArr = new int[]{1, 5, 2, 8, 3, 6};
    String[] stringArrays = new String[3];
    String[] citys = {"Paris", "London", "New York", "Stockholm"};
    String[][] countryCity = new String[2][2];
    int index = 0;
    int indexFound = Arrays.binarySearch(numArr, 5);

    void emptyArray(){
        System.out.println("Empty Array with 3 positions " + Arrays.toString(stringArrays));
    }

    void storedInts() {
        System.out.println("1: --> Stored ints: " + Arrays.toString(num));
    }

    void indexOf() {
        if(numArr[1] == 5){
            System.out.println(findIndex(numArr, 2));
            System.out.println("Array: " + Arrays.toString(numArr));
        }
    }
    public static int findIndex(int[] numArr, int v){
        for(int j = 0; j < numArr.length; j++){
            if(numArr[j] == v) {
                System.out.println("2: --> Number: " + numArr[1] + " has index: " + numArr[j]);
                return j;
            }
        }
        return -1;
    }

    void cityArr(){
        System.out.println("3: --> My created String array: " + Arrays.toString(citys));
        Arrays.sort(citys);
        System.out.println("3: --> My sorted Array: " + Arrays.toString(citys));
    }

    void copyArr(){
        System.out.println("4: --> " + Arrays.toString(citys) + " first Array!");
        String[] cities = Arrays.copyOf(citys, citys.length);
        System.out.println("4: --> " + Arrays.toString(cities) + " the copied Array!");
    }

    void citContSOUT(){
        String[][] countryCity = new String[2][2];
        countryCity[0][0] = "France";
        countryCity[0][1] = "Denmark";

        countryCity[1][0] = "Paris";
        countryCity[1][1] = "Copenhagen";

        for(int i = 0; i < countryCity.length; i++){
            for(int j = 0; j < countryCity.length; j++){
                System.out.println(countryCity[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("5: --> Not a good way to print it out like this: " + countryCity[0][0] + " match with " + countryCity[1][0]);
        System.out.println("5: --> Not a good way to print it out like this: " + countryCity[0][1] + " match with " + countryCity[1][1]);
    }
    void citCont(){
        System.out.println("5: --> The right way: ");
        String[][] countryCity = new String[2][2];
        countryCity[0][0] = "France";
        countryCity[0][1] = "Paris";

        countryCity[1][0] = "Denmark";
        countryCity[1][1] = "Copenhagen";

        for(int i = 0; i < countryCity.length; i++){
            for(int j = 0; j < countryCity.length; j++){
                System.out.print(countryCity[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    void averageArr(){
        double[] arr = {43,5,23,17,2,14};
        double length = arr.length;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double average = sum / length;
        System.out.println("6: --> " + average);
    }

    void oddEven(){
        int[] nr = {1,2,3,4,5,6,10,11,12,13};
        System.out.println("7: --> Array: " + Arrays.toString(nr));
        for(int i = 0; i < nr.length; i++){
            if(nr[i]%2 != 0){
                System.out.println("This is a odd number: " + nr[i]);
            }
        }
    }

    void duplicate(){
        int[] dupli = {20,20,40,20,30,40,50,60,50};
        System.out.println("8: --> Org Array: " + Arrays.toString(dupli));
        Arrays.sort(dupli);
        System.out.println("Then sorted Array: " + Arrays.toString(dupli));
        int v = dupli.length;
        v = remove(dupli, v);
        for(int i = 0; i < v; i++){
            System.out.print(dupli[i] + " ");
        }
    }

    public static int remove(int[] duplic, int v){
        if(v == 0 || v == 1){
            return v;
        }
        int[] duplicArr = new int[v];
        int next = 0; //next element
        for (int i = 0; i < v - 1; i++){
            if(duplic[i] != duplic[i + 1]){
                duplicArr[next++] = duplic[i];
            }
        }
        duplicArr[next++] = duplic[v - 1];
        //change the original array
        for(int i = 0; i < next; i++){
            duplic[i] = duplicArr[i];
        }
        System.out.print("Removed duplicated! ");
        return next;
    }

}