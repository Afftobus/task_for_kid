package com.company;

public class Main {
    /* в массиве только числа от 1 до 10
     * нужно найти число, которое чаще других повторяется в массиве*/

    static hardArray

    public static void main(String[] args) {
        int[] myArray;

        myArray = new int[]{5, 5, 5, 2, 2, 1, 3, 6, 8};
        if (hardArray(myArray) == 5) System.out.println("Good job!");
        else System.out.println("ERROR!");

        myArray = new int[]{0,0,0,0,1};
        if (hardArray(myArray) == 1) System.out.println("Good job!");
        else System.out.println("ERROR!");

        myArray = new int[]{1,2,3,4,5,6};
        if (hardArray(myArray) == 1) System.out.println("Good job!");
        else System.out.println("ERROR!");

        myArray = new int[]{};
        if (hardArray(myArray) == 0) System.out.println("Good job!");
        else System.out.println("ERROR!");
    }
}
