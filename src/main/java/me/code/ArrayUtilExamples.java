package me.code;

import java.util.Arrays;

public class ArrayUtilExamples {

    String[] names = {"Markus", "Simon", "Johan", "Robert", "Zack", "Sandra", "Julia", "Jenny"};
    String[] staff = {"Åsa", "Jenna", "Kent", "Jon", "Linus", "Maria"};


    void putTogether(){
        //names[names.length]=staff[0];
        //String[] newList = new String[8+6];
        //newList[0] = names[14];
        String[] newLists = Arrays.copyOf(names, names.length + staff.length);
        System.out.println(Arrays.toString(newLists));
        int indexToAdd = names.length; //start adding

        //add to list
        for(int i = 0; i < staff.length; i++){
            newLists[indexToAdd] = staff[i];
            indexToAdd++;
            System.out.println(Arrays.toString(newLists));
            System.out.println(newLists[i] + " : " + staff[i] + " : " + names[i + 1]);
        }
    }

    void sortAndSearch(){
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        for(String name : names){
            System.out.println(name);
        }
        int indexForJohan = Arrays.binarySearch(names, "Johan");
        int indexForSimon = Arrays.binarySearch(names, "Simons");
        System.out.println("At index: " + indexForJohan);
        System.out.println("At index: " + indexForSimon);

        System.out.println(names.length + " If not sorted or not found it gives me a negative number ");
        //names[names.length] = "Lee"; can`t do without expand or copy.

        names = Arrays.copyOf(names, names.length +1);
        names[names.length -1] = "Lee";

        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        names = Arrays.copyOfRange(names, names.length, 9);
        //names[names.length -1] = "Linda";
        System.out.println(Arrays.toString(names));
    }




}
