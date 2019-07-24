package com.company;

import java.util.Scanner;

public class DoubleAndAddFive {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);// Create a Scanner object

        System.out.println("Enter number"); //prompt for user to input number

        int userInput = keyboard.nextInt();

        System.out.println("When  your number is doubled and five is added " + ((userInput * 2) + 5) + " is the result"); //users input + 5
    }
    }
