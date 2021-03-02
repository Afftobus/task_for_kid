package com.company;

public class Main {
    /* Напиши функцию, которая принимает массив чисел и ищет максимальное число
        числв в массиве могут быть только положительные
     */

    static maximalnoe

    public static void main(String[] args) {
        int[] myArray;

        myArray = new int[]{5, 6, 7, 2, 22, 31, 16};
        if (maximalnoe(myArray) == 31) System.out.println("Good job!");
        else System.out.println("ERROR!");

        myArray = new int[]{0};
        if (maximalnoe(myArray) == 0) System.out.println("Good job!");
        else System.out.println("ERROR!");

        myArray = new int[]{-2, -3};
        if (maximalnoe(myArray) == 0) System.out.println("Good job!");
        else System.out.println("ERROR!");

        myArray = new int[]{};
        if (maximalnoe(myArray) == 0) System.out.println("Good job!");
        else System.out.println("ERROR!");

    }
}
