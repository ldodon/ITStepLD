package com.itstep.Home_work_1;

import java.util.Scanner;

/**
 * Created by utilizator on 4/29/20.
 */
public class Homework5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Hour");
        int Hour = scanner.nextInt();
        String Result;
        if (Hour >= 0 && Hour < 6) {
            Result = "Good night";
        } else if (Hour >= 6 && Hour < 13) {
            Result = "Good morning";
        } else if (Hour >= 13 && Hour < 17) {
            Result = "Good Day";
        } else {
            Result = "Good evening";
        }
        System.out.println(Result);

    }

}


