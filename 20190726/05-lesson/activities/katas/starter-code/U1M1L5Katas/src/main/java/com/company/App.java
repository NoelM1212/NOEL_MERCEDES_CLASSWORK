package com.company;


public class App {

    public static void main(String[] args) {
        //call method you would like to use enter value
        subtractOrZero(5, 6);

    }

    public static int subtractTwo(int a, int b) {
        int c = a - b;
        return c;

    }

    public static int subtractOrZero(int a, int b) {
        int c = a - b;

        if (c > 0) {
            return c;
        } else {
            return 0;
        }
        //System.out.println(c);
    }

    public static int max(int a, int b, int c) {
        int highNum;
        if (a > b && a > c) {
            highNum = a;
            System.out.println(highNum);
        } else if (b > a && b > c) {
            highNum = b;
            System.out.println(highNum);
        } else if (c > a && c > b) {
            highNum = c;

        }
        System.out.println(highNum);

        return highNum;
    }

    public static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else {
            if (b < a && b < c) {
                return b;
            } else {
                return c;
            }
        }
      public static boolean isLarger(int a, int b){
            if (a > b) {
                return true;
            } else {
                return false;
            }

        }


    }
}