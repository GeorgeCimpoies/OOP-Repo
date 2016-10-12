//Time Complexity: O(log(n))

package com.company;
import java.util.Scanner;

class Program {

    private int sum;
    int M[][] = new int[][]{{1, 1}, {1, 0}};

    private int fibonacci(int n) {
        int[][] f = new int[][]{{1, 1}, {1, 0}};
        if (n == 0)
            return 0;
        power(f, n - 1);

        return f[0][0];
    }

    /*Multiplier method designed to multiply 2x2 matrices*/
    private void multiply(int F[][], int M[][]) {
        int x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
        int y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
        int z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
        int w = F[1][0] * M[0][1] + F[1][1] * M[1][1];

        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;

        if ((F[0][0] % 2 == 0) && (F[0][0]<4000000))
            this.sum = sum + F[0][0];
    }

    /*Method to calculate F to the power n*/
    private void power(int F[][], int n) {
        int i;

        // n - 1 times multiply the matrix to {{1,0},{0,1}}
        for (i = 2; i <= n; i++) {
            multiply(F, M);
        }
    }

    public static void main(String args[]) {
        Program p = new Program();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Submit the desired number:");
        int n = keyboard.nextInt();
        p.fibonacci(n);
        System.out.println("Fibonacci sum of even terms = " + p.sum);
    }
}
