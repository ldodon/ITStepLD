package com.itstep.Home_work_2;

import java.util.Scanner;

/**
 The user enters elements of a one-dimensional array from the keyboard. Find the sum and arithmetic
 mean of the array element; display all elements of the array.
 */
public class Task6 {
 public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  int [] numbers = new int[5];
  int sum = 0;
  for (int i = 0; i < numbers.length; i++) {
   System.out.println("Please enter number");
   numbers[i] = input.nextInt();
  }
  for( int num : numbers) {
   System.out.print(num);
   sum = sum+num;
  }
  System.out.println("\nSum of array elements is:"+sum);
  double average = sum / numbers.length;
  System.out.format("The average is: %.2f", average);
 }
 }

