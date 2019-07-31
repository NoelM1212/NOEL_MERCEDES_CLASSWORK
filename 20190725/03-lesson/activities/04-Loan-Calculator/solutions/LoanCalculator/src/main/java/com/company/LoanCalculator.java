package com.company;
import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the loan amount.");
        int principal = Integer.parseInt(scan.nextLine());

        System.out.println("Please enter the term of the mortgage in months.");
        int term = Integer.parseInt(scan.nextLine());

        System.out.println("Please enter the annual interest rate.");
        double intRate = Double.parseDouble(scan.nextLine());
        intRate = intRate/12/100;

        double payment = principal * intRate * Math.pow(1 + intRate, term)/(Math.pow(1 + intRate, term) - 1);

        System.out.format("Your monthly payment is $%f", payment);
    }
}
