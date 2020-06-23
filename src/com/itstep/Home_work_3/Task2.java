package com.itstep.Home_work_3;

import java.util.Scanner;

/**
 Write a method that displays a horizontal or vertical line made of
 a symbol. The method takes the following as parameters: line length,
 direction, symbol.
 */
public class Task2 {
 public static void displaySymbol(int lineLength, Direction direction,
                                  String symbol) {
  for (int i = 0; i < lineLength; i++) {
   if (Direction.HORIZONTAL.equals(direction)) {
    System.out.print(symbol);
   } else
    System.out.println(symbol);

  }
 }

 public static void main(String[] args) {

  displaySymbol(7, Direction.VERTICAL, "*");

 }
 public enum Direction {
  HORIZONTAL, VERTICAL
 }
}