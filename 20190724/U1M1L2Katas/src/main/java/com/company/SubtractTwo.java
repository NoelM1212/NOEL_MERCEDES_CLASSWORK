package com.company;

import java.util.Scanner;

public class SubtractTwo {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);// Create a Scanner object

        System.out.println("Enter number"); //prompt for user to input number

        int userInput = keyboard.nextInt();

        System.out.println( "When your number is reduced by two "+(userInput - 2) + " is the result" ) ; //users input - 2

    }
}
