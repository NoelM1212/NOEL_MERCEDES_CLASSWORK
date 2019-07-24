package com.company;

import java.util.Scanner;

public class MultiplyThree {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);// Create a Scanner object

        System.out.println("Enter number"); //prompt for user to input number

        float userInput1 = keyboard.nextInt();

        System.out.println("Enter number"); //prompt for user to input number

        float userInput2 = keyboard.nextInt();

        System.out.println("Enter number"); //prompt for user to input number

        float userInput3 = keyboard.nextInt();

        System.out.println( "When your numbers are multiplied by each other "+(userInput1*userInput2*userInput3) + " is the result" ) ; //users input * 3

    }
}