package com.company;

import java.util.Random;

public class LotteryDraw {
    public static final int VAL_MAX = 64;
    public static final int QUOTA_NUMBERS_DRAWN = 8;
    private static Random generator = new Random();
    private int valMax;
    private int nbOfNumbers;
    private long numbersDrawn;

    public LotteryDraw() {
        this(6, 49);
    }

    public LotteryDraw(int n, int m) {
        this.valMax = 49;
        this.nbOfNumbers = 6;
        this.numbersDrawn = 0L;
        boolean ok = false;
        if (m >= 1 && m <= 64 && m / 8 >= 1 && n >= 1 && n <= m / 8) {
            this.nbOfNumbers = n;
            this.valMax = m;
            ok = true;
        }

        if (!ok) {
            System.err.println("Illegal arguments. Maximum allowed value given=" + m + " number of numbers per draw=" + n);
        }

    }

    private void drawOneNumber() {
        this.numbersDrawn |= 1L << generator.nextInt(this.valMax);
    }

    public void draw() {
        if (Long.bitCount(this.numbersDrawn) < this.nbOfNumbers) {
            do {
                this.drawOneNumber();
            } while (Long.bitCount(this.numbersDrawn) < this.nbOfNumbers);

        }
    }

    public String toString() {
        String s = "LotteryDraw " + this.nbOfNumbers + " of " + this.valMax + ".\nNumbers drawn: ";

        for (int i = 0; i < this.valMax; ++i) {
            if ((this.numbersDrawn & 1L << i) != 0L) {
                s = s + (i + 1) + " ";
            }
        }

        return s;
    }

    public void list() {
        System.out.println(this);
    }

    public void checkWins(LotteryTicket b) {
        int n = 0;
        int[] numbers = b.whatNumbers();
        if (numbers.length != this.nbOfNumbers) {
            System.out.println("Ticket is not for this kind of lottery draw (" + this.nbOfNumbers + "!=" + numbers.length + ")");
        } else {
            System.out.print("Numbers which match draw are: ");

            for (int i = 0; i < numbers.length; ++i) {
                if ((this.numbersDrawn & 1L << numbers[i] - 1) != 0L) {
                    System.out.print(numbers[i] + " ");
                    ++n;
                }
            }

            if (n == 0) {
                System.out.println(" none");
            }

        }
    }
}
