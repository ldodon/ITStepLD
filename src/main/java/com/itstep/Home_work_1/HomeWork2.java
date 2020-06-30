package com.itstep.Home_work_1;

import java.util.Scanner;

/**
 * Created by utilizator on 4/29/20.
 */
public class HomeWork2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNumber = scanner.nextInt();
        System.out.println("First Number are: " + firstNumber);


        System.out.println("Enter second Number");

        int secondNumber = scanner.nextInt();
        System.out.println("Second Number are: " + secondNumber);

        int SumNumber = firstNumber+secondNumber;
        System.out.println("Sum Number are: " + SumNumber);

        int SubNumber = firstNumber-secondNumber;
        System.out.println("Sub Number are: " + SubNumber);

        int MultNumber = firstNumber*secondNumber;
        System.out.println("Multiplication Number are: " + MultNumber);

    }

}
