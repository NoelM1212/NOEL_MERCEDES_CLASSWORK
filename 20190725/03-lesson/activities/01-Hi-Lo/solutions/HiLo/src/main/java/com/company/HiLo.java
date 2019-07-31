package com.company;
import java.util.Scanner;
import java.util.Random;

public class HiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Hi-Low!");
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();

        System.out.format("OK, %s, here are the rules:%n", name);

        System.out.println("I'm going to pick a number between 1 and 100, inclusive.");
        System.out.println("You're going to try to guess what number I picked.");

        boolean correctGuess = false;

        Random randomGenerator = new Random();
        int compGuess = randomGenerator.nextInt(100) + 1;
        int userGuess;
        int numberOfGuesses = 0;

        while( !correctGuess ) {
            numberOfGuesses++;

            System.out.println("Guess a number: ");
            userGuess = Integer.parseInt(scan.nextLine());

            if(userGuess > compGuess) {
                System.out.println("Too high!");
            } else if (userGuess < compGuess) {
                System.out.println("Too low!");
            } else {
                correctGuess = true;
            }
        }

        System.out.format("Congratulations, %s! You win!%n", name);
        System.out.format("It took you %d guesses to find my number!%n", numberOfGuesses);

    }
}
