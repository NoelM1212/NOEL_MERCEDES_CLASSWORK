package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;
public class AverageThree {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);// Create a Scanner object

        System.out.println("Enter a number 1"); // prompt for user input number

        double userInput = keyboard.nextInt();// user input number

        System.out.println("Enter a number 2");// prompt for user input number

        double userInput2 = keyboard.nextInt();// user input number

        System.out.println("Enter a number 3");//prompt for user input number

        double userInput3 = keyboard.nextInt();// user input number

        double average = ( userInput + userInput2 + userInput3 )/3 ;


        DecimalFormat sum= new DecimalFormat("0.00");
        System.out.println( "the average of all three numbers is "+  sum.format(average));
        }

        }
