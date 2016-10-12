package com.company;

import java.util.*;

public class Main {

    //checks whether an int is prime or not.
    public static boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n % 2 == 0) return false;
        //if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int[][] generateMatrix(int n) {
        int total = n * n;
        int[][] result = new int[n][n];

        int x = 0;
        int y = 0;
        int step = 0;

        for (int i = total + 1; i > 1; ) {
            while (y + step < n) {
                i--;
                result[x][y] = i;
                y++;

            }
            y--;
            x++;

            while (x + step < n) {
                i--;
                result[x][y] = i;
                x++;
            }
            x--;
            y--;

            while (y >= step) {
                i--;
                result[x][y] = i;
                y--;
            }
            y++;
            x--;
            step++;

            while (x >= step) {
                i--;
                result[x][y] = i;
                x--;
            }
            x++;
            y++;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println("I've only been able to design an algorithm to construct the matrix");
        System.out.println("starting from (0,0), instead of (n,n) but the diagonals are the same");
        System.out.println("so the program still works just fine");
        System.out.println();

        int n = 7;
        float numberOfPrimes = 0;
        int[][] result1 = generateMatrix(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result1[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            if (isPrime(result1[i][i])) {
                numberOfPrimes += 1;
                //System.out.println(result1[i][i]+"////"+result1[i][n-i-1]);
            }
            if (isPrime(result1[i][n - i - 1])){
                numberOfPrimes += 1;
            }
        }
        numberOfPrimes = numberOfPrimes - 2;
        System.out.println();
        System.out.print("The ratio for n=7 is: "+(float)numberOfPrimes/(2*n-1));
        System.out.println();

        while(((float) numberOfPrimes / ((2 * n) - 1)) > (float) 0.1){
            n += 2;
        }
        System.out.println("If the process is continued, the side length of\n" +
                "the square spiral for which the ratio of primes along both diagonals first falls below\n" +
                "10% is "+(n));
    }
}
