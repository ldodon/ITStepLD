package com.itstep.Home_work_1;
import java.util.Scanner;

/**
 * Created by utilizator on 4/29/20.
 */
public class HomeWork4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Meters");
        double Meters= scanner.nextInt();
        double Miles = (Meters /1.609344);
        double Inches = (Meters*39.37);
        double Yard = (Meters*1.09361);
        System.out.println("Miles are " + Miles);
        System.out.println("Inches are " + Inches);
        System.out.println("Yard are " + Yard);
    }
}
