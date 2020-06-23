package com.itstep.Home_work_3;

import java.util.Scanner;

/**
 Write a method that takes two numbers as a parameter and displays
 all even numbers between them.
 */
public class Task1 {

    public static void EvenNum (int number1, int number2){
        for (int i = number1; i <number2; i++)
            if (i % 2 == 0){
                System.out.println(i);
            }
    }
    public   static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second Number");

        int secondNumber = scanner.nextInt();
        if (firstNumber>secondNumber) {
            EvenNum(secondNumber, firstNumber);
        }
        else if (firstNumber<secondNumber){
            EvenNum(firstNumber, secondNumber);
        }
           else System.out.println("The number are equal");
        }
}
