package com.company;

import static java.lang.System.out;

public class Main {

    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int defaultValue = number;
        while (defaultValue > 0) {
            reversed = 10 * reversed + defaultValue % 10;
            defaultValue /= 10;
        }
        return number == reversed;
    }

    public static void main(String[] args) {

        int max = 100001;

        for (int i = 999; i >= 100; i--) {
            if (max >= i * 999) {
                break;
            }
            for (int j = 999; j >= i; j--) {
                int p = i * j;
                if (max < p && isPalindrome(p)) {
                    max = p;
                }
            }
        }
        out.println("The palindrome is "+max);
    }
}
