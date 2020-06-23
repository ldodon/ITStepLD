package com.itstep.Home_work_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
    ` * Created by utilizator on 5/27/20.
 */
public class Main {
    public static ArrayList<Integer> number = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter 6 numbers");

        for (int i = 0; i < 3; i++) {
            number.add(scanner.nextInt());

        }

        do {
            System.out.println("Menu:\n 1-Add an item to the list;" +
                    "\n 2-Delete an item from the list;" +
                    "\n 3-Display the list content;" +
                    "\n 4-Check if a value is in the list;" +
                    "\n 5-Replace the value in the list." +
                    "\n 6-Exit");
            System.out.println("Please, enter your menu choise");
            int menu = scanner.nextInt();
            if (menu == 6) {
                break;
            }

            switch (menu) {
                case 1:
                    addItems(scanner);
                    break;
                case 2:
                    deleteItems(scanner);
                    break;
                case 3:
                    displayList();
                    break;
                case 4:
                    checkList(scanner);
                    break;
                case 5:
                    replaceList(scanner);
                    break;
                default:
                    System.out.println("Incorrect choise");
            }
        } while (true);
    }

    public static void addItems(Scanner scanner) {
        System.out.println("Enter your items");
        int addI = scanner.nextInt();

        number.add(addI);
    }

    public static void deleteItems(Scanner scanner) {
        displayList();
        System.out.println("\nEnter item you want to delete");
        Integer delI = scanner.nextInt();
        number.remove(delI);

    }

    public static void displayList() {
        System.out.println("Your ArrayList is: ");
        for (Integer i : number) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void checkList(Scanner scanner) {
        System.out.println("Enter item you want to check");
        int chI = scanner.nextInt();
        if (number.contains(chI)) {
            System.out.println(chI + " is in the list");

        } else
            System.out.println(chI + " isn't in the list");

    }

    public static void replaceList(Scanner scanner) {
        displayList();
        System.out.println("Enter item you want to replace");
        Integer oldValue = scanner.nextInt();

        if (number.contains(oldValue)) {
            System.out.println("Enter new value");
            Integer newValue = scanner.nextInt();
            Collections.replaceAll(number, oldValue, newValue);
        } else {
            System.out.println("Incorrect number");
            replaceList(scanner);
        }
    }
}

