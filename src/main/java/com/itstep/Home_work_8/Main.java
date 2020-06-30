package com.itstep.Home_work_8;

import java.util.Scanner;

/**
 * Created by utilizator on 6/10/20.
 */
public class Main {

    public static void main(String[] args) throws CustomException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter number from 0 to 9");
        String number = scanner.next();
       convert(number,scanner);
    }

    public static void convert (String number, Scanner scanner) throws CustomException {
 try {
     int convInt = Integer.parseInt(number);
     if (convInt >= 0 && convInt <= 9) {
         System.out.println("Converted number is: " + convInt);
     } else {
         throw new CustomException(number);
     }
 }catch (NumberFormatException a){
     System.out.println("You tap wrong number: " + number +
             ". Enter new valid number");
     String num = scanner.next();
     convert(num, scanner);
 }
    }
}
