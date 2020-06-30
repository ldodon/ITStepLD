package com.itstep.Home_work_2;

import java.util.Scanner;

/**
 The user enters the length of a line and a symbol which the line should be made of.
 Display a vertical line made of the entered symbol of the specified length. For example,
 if the user entered 5 and %, the output would be as follows:
 */
public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();
        String text = "";
        while (0<=number) {
            text= "%";
            System.out.println(text);
            number--;
        }
    }
}
