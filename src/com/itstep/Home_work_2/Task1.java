package com.itstep.Home_work_2;

import java.util.Scanner;

/**The user enters two numbers from the keyboard. Display all odd numbers in the
//        specified range. If the range limits were specified incorrectly,
//        normalize them. For example, the user entered 20 and 11, normalize the limits so
//        that 11 becomes the beginning of the range and 20 the end.*/
public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second Number");

        int secondNumber = scanner.nextInt();
        if (firstNumber>secondNumber) {
            int temp = firstNumber;
            firstNumber= secondNumber;
            secondNumber = temp;
            }
        for (int i = firstNumber; i <secondNumber; i++)
        if (i % 2 != 0){
            System.out.println(i);
        }
        }
    }
