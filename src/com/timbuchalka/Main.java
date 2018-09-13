package com.timbuchalka;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        readIntegers(3);
        findMin(readIntegers(5));
    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " integers");
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int findMin(int[] array) {
        //bubble sort array in ascending order and return the first element of the array
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        System.out.println("The minimum number in the given array is: " + array[0]);
        return array[0];
    }
}
