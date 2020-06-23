package com.itstep.Home_work_3;

import java.util.Scanner;

/**
 Write a method that returns the largest of four numbers.
 Numbers are passed as parameters.
 */
public class Task3 {
 public static int theLargestNumb (int a, int b, int c,
                                    int d) {
  int max=a;
   if((b>a) && (b>c) && (b>d))
    max = b;
   if((c>a) && (c>b) && (c>d))
    max = c;
   if((d>a) && (d>b) && (d>c))
    max = d;
  return max;

 }
  public static void main(String[] args) {
   int z = theLargestNumb(4,9,8,3);
   System.out.println(z);

 }
}
