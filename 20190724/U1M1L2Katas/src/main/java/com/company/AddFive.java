package com.company;

import java.util.Scanner;

import static java.lang.String.format;

public class AddFive {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);// Create a Scanner object

        System.out.println("Enter number"); //prompt for user to input number

        int userInput = keyboard.nextInt();

        System.out.println( "When five is added to your number "+(userInput + 5) + " is the result") ; //users input + 5


    }
}
