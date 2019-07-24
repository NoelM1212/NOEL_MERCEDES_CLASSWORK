package com.company;

import java.util.Scanner;

public class AddThirteen {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);// Create a Scanner object

        System.out.println("Enter number");

        int userInput = keyboard.nextInt();

        System.out.println( "when 13 is added to your number you get " +(userInput + 13) ); // userInput + 13

    }
}
