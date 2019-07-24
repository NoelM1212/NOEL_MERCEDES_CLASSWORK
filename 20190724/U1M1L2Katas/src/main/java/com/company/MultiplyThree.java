package com.company;

import java.util.Scanner;

public class MultiplyThree {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);// Create a Scanner object

        System.out.println("Enter number"); //prompt for user to input number

        float userInput = keyboard.nextInt();

        System.out.println( "When your number is multiplied by three "+(userInput * 3) + " is the result" ) ; //users input * 3

    }
}