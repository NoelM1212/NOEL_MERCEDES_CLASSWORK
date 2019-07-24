package com.company;

import java.util.Scanner;

public class AddFiveAndDouble {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);// Create a Scanner object

        System.out.println("Enter number"); //prompt for user to input number

        int userInput = keyboard.nextInt();

        System.out.println( "When your number is doubled after five has been added "+((userInput + 5)* 2) + " is the result") ; //(users input + 5)*2

    }
}
