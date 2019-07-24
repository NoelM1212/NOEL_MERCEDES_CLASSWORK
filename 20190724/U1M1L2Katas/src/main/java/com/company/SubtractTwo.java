package com.company;

import java.util.Scanner;

public class SubtractTwo {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);// Create a Scanner object

        System.out.println("Enter number"); //prompt for user to input number

        int userInput = keyboard.nextInt();

        System.out.println("Enter second number"); //prompt for user to input number

        int userInput2 = keyboard.nextInt();

        System.out.println( "first number is reduced by your second number  "+(userInput - userInput2) + " is the result" ) ;

    }
}
