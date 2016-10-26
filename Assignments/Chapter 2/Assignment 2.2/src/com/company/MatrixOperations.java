package com.company;

import java.math.BigDecimal;

public class MatrixOperations {

    public MatrixOperations() {

    }

    static String toString(BigDecimal[][] a) {

        StringBuilder sb = new StringBuilder();
        for (int line = 0; line < a.length; line++) {
            sb.append(line == 0 ? "/ " : line == a.length - 1 ? "\\ " : "| ");
            for (int col = 0; col < a[0].length; col++) {
                sb.append(a[line][col]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    static BigDecimal[][] add(BigDecimal[][] a, BigDecimal[][] b) {

        if (a == null || b == null || a.length != b.length || a[0].length != b[0].length) {
            return null;
        }

        BigDecimal[][] c = new BigDecimal[a.length][a[0].length];

        for (int line = 0; line < a.length; line++) {
            for (int col = 0; col < a[0].length; col++) {
                c[line][col] = a[line][col].add(b[line][col]);
            }
        }
        return c;
    }


    private static BigDecimal[][] subtract(BigDecimal[][] a, BigDecimal[][] b) {

        if (a == null || b == null || a.length != b.length || a[0].length != b[0].length) {
            return null;
        }

        BigDecimal[][] c = new BigDecimal[a.length][a[0].length];

        for (int line = 0; line < a.length; line++) {
            for (int col = 0; col < a[0].length; col++) {
                c[line][col] = a[line][col].subtract(b[line][col]);
            }
        }
        return c;

    }

    private static BigDecimal[][] multiply(BigDecimal[][] a, BigDecimal[][] b) {

        if (a == null || b == null || a[0].length != b.length) {
            return null;
        }

        BigDecimal[][] c = new BigDecimal[a.length][b[0].length];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = BigDecimal.valueOf(0);
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] = c[i][j].add(a[i][k].multiply(b[k][j]));
                    //System.out.println("c["+i+"]"+"["+j+"]"+" = "+"a["+i+"]"+"["+k+"]"+" * "+"b["+k+"]"+"["+j+"]");
                }
            }
        }
        return c;

    }

    private static BigDecimal[][] multiplyScalar(BigDecimal[][] a, BigDecimal scalar) {

        if (a == null) {
            return null;
        }


        for (int line = 0; line < a.length; line++) {
            for (int col = 0; col < a[0].length; col++) {
                a[line][col] = a[line][col].multiply(scalar);
            }
        }
        return a;

    }

    private static BigDecimal determinant(BigDecimal[][] a) {

        //TO BE IMPLEMENTED
        return null;

    }

    private static boolean areEqual(BigDecimal[][] a, BigDecimal[][] b) {

        if (a == null || b == null || a.length != b.length || a[0].length != b[0].length) return false;

        for (int line = 0; line < a.length; line++) {
            for (int col = 0; col < a[0].length; col++) {
                if (a[line][col].equals(b[line][col])) return true;
            }

        }
        return false;
    }

    private static boolean isZeroMatrix(BigDecimal[][] a) {

        if (a == null) return false;

        boolean isZero = false;
        for (int line = 0; line < a.length; line++) {
            for (int col = 0; col < a.length; col++) {
                if (a[line][col].equals(BigDecimal.valueOf(0)))
                    isZero = true;
                    else {
                        isZero = false;
                    }

            }

        }

        return isZero;
    }

    private static boolean isIdentityMatrix(BigDecimal[][] a) {

        if (a == null || a.length != a[0].length) return false;

        boolean isIdentityMatrix = false;
        for (int line = 0; line < a.length; line++) {
            for (int col = 0; col < a.length; col++) {
                if ((line == col && a[line][col].compareTo(BigDecimal.valueOf(1)) != 1) || (line != col && a[line][col].compareTo(BigDecimal.valueOf(0)) != 0))
                    isIdentityMatrix = true;
                            else {
                        isIdentityMatrix = false;
                    }


            }
        }

        return isIdentityMatrix;

    }

    private static BigDecimal fillDegree(BigDecimal[][] a) {

        if (a == null) return null;

        BigDecimal numberOfFilledCells = BigDecimal.ZERO;
        for (int line = 0; line < a.length; line++) {
            for (int col = 0; col < a.length; col++) {
                if (a[line][col].compareTo(BigDecimal.valueOf(0)) != 0)
                    numberOfFilledCells  = numberOfFilledCells.add(BigDecimal.ONE);

            }

        }

        return numberOfFilledCells.divide(BigDecimal.valueOf(a.length).multiply(BigDecimal.valueOf(a.length)));

    }


    public static void main(String[] args) {

        BigDecimal[][] m = new BigDecimal[2][2];
        BigDecimal[][] n = new BigDecimal[2][2];
        BigDecimal scalar = new BigDecimal(5);

        m[0][0] = BigDecimal.valueOf(1);
        m[0][1] = BigDecimal.valueOf(0);
        m[1][0] = BigDecimal.valueOf(1);
        m[1][1] = BigDecimal.valueOf(1);

        n[0][0] = BigDecimal.valueOf(5);
        n[0][1] = BigDecimal.valueOf(6);
        n[1][0] = BigDecimal.valueOf(7);
        n[1][1] = BigDecimal.valueOf(8);

        System.out.println(toString(m));
        System.out.println(toString(n));
        System.out.println("Zero Matrix: " + isZeroMatrix(m));
        System.out.println("Identity Matrix: " + isIdentityMatrix(m));
        System.out.println("Equal Matrices " + areEqual(m, n));
        System.out.println("Fill Degree for matrix m " + fillDegree(m));
        System.out.println(toString(add(m, n)));
        System.out.println(toString(subtract(m, n)));
        System.out.println(toString(multiply(m, n)));
        System.out.println(toString(multiplyScalar(m, scalar)));


    }
}
