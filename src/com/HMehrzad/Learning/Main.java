package com.HMehrzad.Learning;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("The sum of digits in number 125 is " + sumDigits(125));
        //System.out.println("The sum of digits in number 125 is " + sumDigits(4));
        //System.out.println("The sum of digits in number 125 is " + sumDigits(123456789));
        //System.out.println("The sum of digits in number 125 is " + sumDigits(10));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0) {
            // extract the last-significant digit
            int digit = number % 10;
            //System.out.println("digit " + digit);
            sum += digit;
            // drop the last-signification digit
            number /= 10; // same as number = number / 10;
            //System.out.println("number " + number);
        }
        return sum;
    }
}