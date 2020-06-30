package com.itstep.Home_work_2;

import java.util.Scanner;

/**
 Calculate the following numbers in a one-dimensional array filled by user:
 The sum of negative numbers.
 The sum of even numbers.
 The sum of odd numbers.
 The product of elements with indexes that can be divided by 3
 The product of the minimum and maximum elements.
 The sum of elements that are between the first and the last positive elements.
 (inclusive first, exclusive last)
 */
public class Task7 {

    public static void main(String args[]) {

        int negs = 0, evens = 0, odds = 0, div = 0;
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter numbers; terminate list with 0");
        while ((num = in.nextInt()) != 0) {
            if (num < 0) {
                negs += num;
            } else if (num % 2 == 0) {
                evens += num;
            } else if (num % 3 == 0) {
                div += num;
            } else {
                odds += num;
            }
        }
        System.out.println("Sum of negatives = " + negs + ", sum of evens = " + evens + ", sum of odds = " + odds + ", divided = " + div );
    }
}

