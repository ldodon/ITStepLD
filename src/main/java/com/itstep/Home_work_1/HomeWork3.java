package com.itstep.Home_work_1;

import java.util.Scanner;

/**
 * Created by utilizator on 4/29/20.
 */
public class HomeWork3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int Number = scanner.nextInt();


        int var = 2;
        int ResultNum = Number % var;
        String Result;
        if (ResultNum == 0) {
            Result = "Even Number";
        } else {
            Result = "Odd Number";
        }
        System.out.println(Result);
    }
}
