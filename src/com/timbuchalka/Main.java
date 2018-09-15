package com.timbuchalka;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in); // Variable must be static because otherwise wouldn't be considered in other methods

    public static void main(String[] args) {
        System.out.println("Enter count");
        int count = scanner.nextInt();
        scanner.next();
        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("Min =" + returnedMin);
    }

//    readIntegers(3);
//    findMin(readIntegers(5));

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine(); //handle the ENTER key being pressed at the event
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE; //becasue every number the user enters must be less or equal to the MAXIMUM, in other words
        // this is an insurance that the minimum value returned was actually input received from the user
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}


//    public static int[] readIntegers(int count) {
//        System.out.println("Enter " + count + " integers");
//        int[] array = new int[count];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        return array;
//    }
//
//    public static int findMin(int[] array) {
//        //bubble sort array in ascending order and return the first element of the array
//        boolean flag = true;
//        while (flag) {
//            flag = false;
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i] > array[i + 1]) {
//                    int temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                    flag = true;
//                }
//            }
//        }
//        System.out.println("The minimum number in the given array is: " + array[0]);
//        return array[0];
//    }
