package com.company;

import java.util.Scanner;

import static java.lang.String.format;

public class AddFive {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);// Create a Scanner object

        System.out.println("Enter number"); //prompt for user to input number

        int userInput = keyboard.nextInt();

        System.out.println("Enter number"); //prompt for user to input number

        int userInput2 = keyboard.nextInt();

        System.out.println("Enter number"); //prompt for user to input number

        int userInput3 = keyboard.nextInt();

        System.out.println("Enter number"); //prompt for user to input number

        int userInput4 = keyboard.nextInt();

        System.out.println("Enter number"); //prompt for user to input number

        int userInput5 = keyboard.nextInt();


        System.out.println( "When all five numbers are added "+(userInput + userInput2+ userInput3+userInput4+userInput5) + " is the result") ; //users input + 5


    }
}
