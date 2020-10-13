package com.company;

public class App {

    public static void main(String[] args) {
        System.out.print(totalEven(new int[] {2, 4, 5, 3,
                7, 6, 1, 9,
                10, 13, 56, 43,
                17, 89, 3, 24,
                37, 12, 101, 112}));
    }

    public static int total (int[] numbers) {

        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }

        return sum;
    }

    public static int totalOdd (int[] numbers) {

        int sum = 0;
        for(int i = 1; i < numbers.length; i += 2) {
            sum += numbers[i];
        }

        return sum;
    }

    public static int totalEven (int[] numbers) {

        int sum = 0;
        for(int i = 0; i < numbers.length; i += 2) {
            sum += numbers[i];
        }

        return sum;
    }

    public static int secondLargestNumber(int[] numbers) {

        int largest, secondLargest;

        if( numbers[1] > numbers[0] ){
            largest = numbers[1];
            secondLargest = numbers[0];
        } else {
            largest = numbers[0];
            secondLargest = numbers[1];
        }

        for(int i = 2; i < numbers.length; i++) {
            if( numbers[i] > largest ) {
                secondLargest = largest;
                largest = numbers[i];
            } else if ( numbers[i] > secondLargest ) {
                secondLargest = numbers[i];
            }
        }

        return secondLargest;
    }

    public static String[] swapFirstAndLast(String[] strings) {

        String temp = strings[0];
        strings[0] = strings[ strings.length - 1 ];
        strings[ strings.length - 1 ] = temp;

        return strings;
    }

    public static int[] reverse(int[] numbers) {

        int[] reversed = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++) {

            // length - (i + 1) is the n-th to last element
            // so when i = 0, it would be the last element
            // when i = 3, it would be the fourth to last element since i=3 is the 4th element, etc
            reversed[i] = numbers[ numbers.length - (i + 1) ];
        }

        return reversed;
    }

    public static String concatenateString(String[] strings) {

        String concat = "";

        for(String word : strings) {
            concat += word;
        }

        return concat;
    }

    public static int[] everyThird(int[] numbers) {

        if( numbers.length < 3 ) {
            return null;
        }


        // integer division ignores any remainder
        // eg, 5/3 = 1, 8/3 = 2, etc
        int[] everyThirdNumber = new int[ numbers.length / 3 ];

        for(int i = 2; i < numbers.length; i +=3) {

            // again, leveraging integer division
            everyThirdNumber[ i/3 ] = numbers[i];
        }

        return everyThirdNumber;
    }

    public static int[] lessThanFive(int[] numbers) {

        int numLessThanFive = 0;

        for(int num : numbers) {
            if ( num < 5 ) {
                numLessThanFive++;
            }
        }

        if ( numLessThanFive == 0 ) {
            return null;
        }

        int[] lessThan = new int[numLessThanFive];

        for(int num : numbers) {
            if ( num < 5 ) {

                // subtracting numLessThanFive from length then decrementing numLessThanFive
                // allows us to go from 0 to length - 1 in order without additional variables
                lessThan[lessThan.length - numLessThanFive] = num;
                numLessThanFive--;
            }
        }

        return lessThan;
    }

    // Challenge
    public static int[][] splitAtFive(int[] numbers) {
        int numLessThanFive = 0;
        int numMoreThanFive = 0;

        for(int num : numbers) {
            if ( num < 5 ) {
                numLessThanFive++;
            } else {
                numMoreThanFive++;
            }
        }

        int[] lessThan = new int[numLessThanFive];
        int[] moreThan = new int[numMoreThanFive];


        for(int num : numbers) {

            // subtracting numLessThanFive from length then decrementing numLessThanFive
            // allows us to go from 0 to length - 1 in order without additional variables
            // same with numMoreThanFive
            if ( num < 5 ) {
                lessThan[lessThan.length - numLessThanFive] = num;
                numLessThanFive--;
            } else {
                moreThan[moreThan.length - numMoreThanFive] = num;
                numMoreThanFive--;
            }
        }

        return new int[][] { lessThan, moreThan };
    }

    // Challenge
    public static String[][] evensAndOdds(String[] strings) {

        //leveraging integer division
        String[] odds = new String[ strings.length/2 ];

        // Set evens to null for reassignment below
        String[] evens = null;

        // again leveraging integer division
        // if it's already of even length, we're good
        // but if it's of odd length, there's one more even index than odd
        if (strings.length % 2 == 0) {
            evens = new String[ strings.length/2];
        } else {
            evens = new String[ strings.length/2 + 1];
        }

        for(int i = 0; i < strings.length; i++) {
            int currIndex = i/2;
            if( i % 2 == 0 ) {
                evens[currIndex] = strings[i];
            } else {
                odds[currIndex] = strings[i];
            }
        }

        return new String[][] { evens, odds };
    }
}