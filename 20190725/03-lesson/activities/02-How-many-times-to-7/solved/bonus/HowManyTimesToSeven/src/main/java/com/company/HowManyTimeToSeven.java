package com.company;
import java.util.Random;
import java.util.Scanner;

public class HowManyTimeToSeven {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        Scanner scan = new Scanner(System.in);
        System.out.print("How many times should I roll the dice? ");
        int numberOfRolls = Integer.parseInt(scan.nextLine());

        int firstDie;
        int secondDie;
        int rollValue;

        int totalTwos = 0;
        int firstTwo = 0;

        int totalThrees = 0;
        int firstThree = 0;

        int totalFours = 0;
        int firstFour = 0;

        int totalFives = 0;
        int firstFive = 0;

        int totalSixes = 0;
        int firstSix = 0;

        int totalSevens = 0;
        int firstSeven = 0;

        int totalEights = 0;
        int firstEight = 0;

        int totalNines = 0;
        int firstNine = 0;

        int totalTens = 0;
        int firstTen = 0;

        int totalElevens = 0;
        int firstEleven = 0;

        int totalTwelves = 0;
        int firstTwelve = 0;

        for(int i = 1; i <= numberOfRolls; i++) {
            firstDie = randomGenerator.nextInt(6) + 1;
            secondDie = randomGenerator.nextInt(6) + 1;
            rollValue = firstDie + secondDie;

            switch (rollValue) {
                case 2:
                    totalTwos++;
                    if (firstTwo == 0) {
                        firstTwo = i;
                    }
                    break;
                case 3:
                    totalThrees++;
                    if (firstThree == 0) {
                        firstThree = i;
                    }
                    break;
                case 4:
                    totalFours++;
                    if (firstFour == 0) {
                        firstFour = i;
                    }
                    break;
                case 5:
                    totalFives++;
                    if (firstFive == 0) {
                        firstFive = i;
                    }
                    break;
                case 6:
                    totalSixes++;
                    if (firstSix == 0) {
                        firstSix = i;
                    }
                    break;
                case 7:
                    totalSevens++;
                    if (firstSeven == 0) {
                        firstSeven = i;
                    }
                    break;
                case 8:
                    totalEights++;
                    if (firstEight == 0) {
                        firstEight = i;
                    }
                    break;
                case 9:
                    totalNines++;
                    if (firstNine == 0) {
                        firstNine = i;
                    }
                    break;
                case 10:
                    totalTens++;
                    if (firstTen == 0) {
                        firstTen = i;
                    }
                    break;
                case 11:
                    totalElevens++;
                    if (firstEleven == 0) {
                        firstEleven = i;
                    }
                    break;
                case 12:
                    totalTwelves++;
                    if (firstTwelve == 0) {
                        firstTwelve = i;
                    }
                    break;
            }
        }

        System.out.format("It took %d rolls before I rolled my first 2%n", firstTwo);
        System.out.format("I rolled a 2 in %d of my rolls%n", totalTwos);

        System.out.format("It took %d rolls before I rolled my first 3%n", firstThree);
        System.out.format("I rolled a 3 in %d of my rolls%n", totalThrees);

        System.out.format("It took %d rolls before I rolled my first 4%n", firstFour);
        System.out.format("I rolled a 4 in %d of my rolls%n", totalFours);

        System.out.format("It took %d rolls before I rolled my first 5%n", firstFive);
        System.out.format("I rolled a 5 in %d of my rolls%n", totalFives);

        System.out.format("It took %d rolls before I rolled my first 6%n", firstSix);
        System.out.format("I rolled a 6 in %d of my rolls%n", totalSixes);

        System.out.format("It took %d rolls before I rolled my first 7%n", firstSeven);
        System.out.format("I rolled a 7 in %d of my rolls%n", totalSevens);

        System.out.format("It took %d rolls before I rolled my first 8%n", firstEight);
        System.out.format("I rolled a 8 in %d of my rolls%n", totalEights);

        System.out.format("It took %d rolls before I rolled my first 9%n", firstNine);
        System.out.format("I rolled a 9 in %d of my rolls%n", totalNines);

        System.out.format("It took %d rolls before I rolled my first 10%n", firstTen);
        System.out.format("I rolled a 10 in %d of my rolls%n", totalTens);

        System.out.format("It took %d rolls before I rolled my first 11%n", firstEleven);
        System.out.format("I rolled a 11 in %d of my rolls%n", totalElevens);

        System.out.format("It took %d rolls before I rolled my first 12%n", firstTwelve);
        System.out.format("I rolled a 12 in %d of my rolls%n", totalTwelves);

    }
}
