package com.company;


import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class LotteryTicket {
    public static final int VAL_MAX = 64;
    public static final int QUOTA_NUMBERS_DRAWN = 8;
    private long numbersOnTicket;
    private int valMax = 49;
    private int nbOfNumbers = 6;

    public LotteryTicket(int n, int m) {
        boolean ok = false;
        if (m >= 1 && m <= 64 && m / 8 >= 1 && n >= 1 && n <= m / 8) {
            this.nbOfNumbers = n;
            this.valMax = m;
            ok = true;
        }

        if (!ok) {
            System.err.println("Illegal arguments. Maximum allowed value given=" + m + " number of numbers allowed on ticket=" + n);
        }

    }

    public String toString() {
        String s = "Lottery ticket for " + this.nbOfNumbers + " out of " + this.valMax + ".\nNumbers written: ";

        for (int i = 0; i < this.valMax; ++i) {
            if ((this.numbersOnTicket & 1L << i) != 0L) {
                s = s + (i + 1) + " ";
            }
        }

        return s;
    }

    public void list() {
        System.out.println(this);
    }

    public void readNumbers() {
        if (Long.bitCount(this.numbersOnTicket) >= this.nbOfNumbers) {
            System.out.println("Already used ticket: " + this);
        } else {
            System.out.print("Your numbers for lottery " + this.nbOfNumbers + " of " + this.valMax + ": ");
            Scanner sc = new Scanner(System.in);
            boolean currentNumber = true;
            boolean ok = true;

            do {
                String s;
                if (sc.hasNext("\\d+")) {
                    s = sc.next("\\d+");
                    System.err.print(s + " ");
                    int val = Integer.parseInt(s);
                    if (val >= 1 && val <= this.valMax) {
                        this.numbersOnTicket |= 1L << val - 1;
                        System.out.println("Number accepted: " + val + (this.nbOfNumbers - Long.bitCount(this.numbersOnTicket) > 0 ? ". Need to get " + (this.nbOfNumbers - Long.bitCount(this.numbersOnTicket)) + " more numbers" : ". Set of numbers complete"));
                    } else {
                        System.out.println("Invalid number:" + val);
                    }
                } else if (sc.hasNext("\\D+")) {
                    s = sc.next("\\D+");
                    System.out.print(s + " ignored\n");
                } else if (sc.hasNext("(\\d+\\D*)+|(\\D+\\d*)+")) {
                    s = sc.next("(\\d+\\D*)+|(\\D+\\d*)+");
                    System.out.print(s + " ignored\n");
                }
            } while (Long.bitCount(this.numbersOnTicket) < this.nbOfNumbers);

        }
    }

    public int[] whatNumbers() {
        int[] numbers = new int[this.nbOfNumbers];
        int i = 0;

        for (int j = 0; i < this.valMax; ++i) {
            if ((this.numbersOnTicket & 1L << i) != 0L) {
                numbers[j++] = i + 1;
            }
        }

        return numbers;
    }

    public void autofill() {
        Random gen = new Random((new Date()).getTime());
        if (Long.bitCount(this.numbersOnTicket) < this.nbOfNumbers) {
            do {
                this.numbersOnTicket |= 1L << gen.nextInt(this.valMax);
            } while (Long.bitCount(this.numbersOnTicket) < this.nbOfNumbers);
        }

    }
}