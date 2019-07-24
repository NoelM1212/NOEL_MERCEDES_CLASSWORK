package com.company;

import java.util.Scanner;

public class AverageThree {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);// Create a Scanner object

        System.out.println("Enter a number 1"); // prompt for user input number

        int userInput = keyboard.nextInt();// user input number

        System.out.println("Enter a number 2");// prompt for user input number

        int userInput2 = keyboard.nextInt();// user input number

        System.out.println("Enter a number 3");//prompt for user input number

        int userInput3 = keyboard.nextInt();// user input number

        int average = ( userInput + userInput2 + userInput3 )/3 ;

        System.out.println( "the average of all three numbers is " + average);
    }

}
