package com.itstep.Home_work_2;

import java.util.Scanner;

/**
 The user enters two numbers (the beginning and the end of the range). Analyze all the numbers in
 this range. The output should be according to the rules below.If the number is divisible by 3
 (it is divided by 3 without a remainder), display the word Fizz. If the number is divisible by 5,
 display the word Buzz. If the number is divisible by 3 and 5, output Fizz Buzz. If the number is
 not divisible by 3 or 5, output the number itself.
 */
public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second Number");
        int secondNumber = scanner.nextInt();

        for (int i = firstNumber; i < secondNumber; i++) {
            if (i%3==0 && i%5==0) System.out.println("Fizz Buzz");
            else if (i%3==0) System.out.println("Fizz");
            else if (i%5==0) System.out.println("Buzz");
            else
            System.out.println(i);
        }
    }
    }

