package com.itstep.Home_work_2;

import java.util.Scanner;

/**
 The user enters a number from the keyboard. Calculate the factorial of the number. For example,
 if 3 was entered, the factorial would be 1*2*3 = 6. The factorial formula is n! = 1*2*3...*n,
 where n is the number to calculate the factorial. */
public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();
        int fact=1;

        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);

    }
}