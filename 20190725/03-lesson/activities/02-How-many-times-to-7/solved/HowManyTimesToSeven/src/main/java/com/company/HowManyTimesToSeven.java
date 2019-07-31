package com.company;
import java.util.Random;
import java.util.Scanner;

public class HowManyTimesToSeven {
    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int numberOfRolls = 100;

        int firstDie;
        int secondDie;
        int rollValue;

        int totalSevens = 0;
        int firstSeven = 0;


        for(int i = 1; i <= numberOfRolls; i++) {
            firstDie = randomGenerator.nextInt(6) + 1;
            secondDie = randomGenerator.nextInt(6) + 1;
            rollValue = firstDie + secondDie;

            if (rollValue == 7) {
                totalSevens++;
                if (firstSeven == 0) {
                    firstSeven = i;
                }
            }

        }

        System.out.format("It took %d rolls before I rolled my first 7%n", firstSeven);
        System.out.format("I rolled a 7 in %d of my rolls%n", totalSevens);

    }
}
