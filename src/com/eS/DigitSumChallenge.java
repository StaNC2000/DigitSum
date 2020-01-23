package com.eS;

public class DigitSumChallenge {

    public static int sumDigits(int number){
        int sum = 0;

        if (number < 10) {
           return - 1;
        }

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5

        while (number > 0){
            // extract least significant digit
            int digit = number % 10;
            sum = sum + digit;

            // drop the least significant digit
            number = number / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println("The sum of digits in numbers is " + sumDigits(159));
        System.out.println("The sum of digits in numbers is " + sumDigits(-159));
        System.out.println("The sum of digits in numbers is " + sumDigits(5));
        System.out.println("The sum of digits in numbers is " + sumDigits(1599875465));
        System.out.println("The sum of digits in numbers is " + sumDigits(-1596598));


    }
}
