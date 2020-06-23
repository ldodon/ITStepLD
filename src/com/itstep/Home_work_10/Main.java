package com.itstep.Home_work_10;

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {

        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        System.out.println("Current Array: " + Arrays.toString(arr));

        int[] bublearr = Arrays.copyOf(arr, arr.length);
        long a = System.currentTimeMillis();
        System.out.println("Current Time: " + a);

        BubbleSort.bubbleSort(bublearr);
        long b = System.currentTimeMillis();
        System.out.println("Current Time: " + b);
        System.out.println("Bubble Sorted array");
        printArray(bublearr);
        long c = b - a;
        long d = System.currentTimeMillis();
        System.out.println("Current Time: " + d);
        int n = arr.length;
        QuickSort.sort(arr, 0, n - 1);
        long e = System.currentTimeMillis();
        System.out.println("Current Time: " + e);

        System.out.println("Quick Sorted array");
        printArray(arr);
        long f = e - d;
        long g = f-c;
        System.out.println("The Difference of time: " + g + " milliseconds");
    }
}

