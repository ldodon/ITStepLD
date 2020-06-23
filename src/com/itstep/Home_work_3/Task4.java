package com.itstep.Home_work_3;

/**
 Write a method that checks if a number is prime. The number is passed
 as a parameter. If the number is prime, return true, otherwise false.
 */
public class Task4 {
 public static boolean thePrimeNumb(int num) {

  boolean flag = false;
  for (int i = 2; i <= num / 2; ++i) {
   if (num % i == 0) {
    flag = true;
    break;
   }
  }
   if (!flag){
    System.out.println(num + " is a prime number.");}
   else{
    System.out.println(num + " is not a prime number.");
  }
  return !flag;

 }

 public static void main(String[] args) {
  boolean z = thePrimeNumb(2);
  System.out.println(z);
 }
}
