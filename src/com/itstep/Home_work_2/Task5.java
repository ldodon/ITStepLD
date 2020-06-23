package com.itstep.Home_work_2;

import java.util.Scanner;

/**
 Display a multiplication table in the range specified by the user. For example, if the user
 entered 3 and 5, the table may be as follows:
 3*1 = 3
 3*2 = 6
 3*3 = 9
 */
public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second Number");
        int secondNumber = scanner.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(firstNumber+" * "+i+" = "+firstNumber*i);}
        for (int i = 1; i <=10; i++) {
            System.out.println(secondNumber+" * "+i+" = "+secondNumber*i);
        }
    }
}