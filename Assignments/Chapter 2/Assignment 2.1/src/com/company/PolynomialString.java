package com.company;

/**
 * Created by George Cimpoies on 10/13/2016.
 */

import java.util.Iterator;

import com.company.Polynomial;
import com.company.Term;

public class PolynomialString {

    public PolynomialString() {
    }

    public static Polynomial PString(String polynomialRead) {
        Polynomial p = new Polynomial();
        String newPolynomial = polynomialRead.replaceAll("-", "+-").replaceAll(" ", "");
        String[] parts = newPolynomial.split("\\+");
        float[] coef = new float[100];
        int[] power = new int[100];

        for (int i = 0; i < parts.length; ++i) {
            if (!parts[i].equals("")) {
                if (!parts[i].contains("x")) {
                    coef[i] = Float.parseFloat(parts[i]);
                    power[i] = 0;
                } else {
                    String[] t;
                    if (!parts[i].contains("^")) {
                        if (parts[i].equals("x")) {
                            coef[i] = 1.0F;
                            power[i] = 1;
                        } else if (parts[i].equals("-x")) {
                            coef[i] = -1.0F;
                            power[i] = 1;
                        } else {
                            t = parts[i].split("x");
                            coef[i] = Float.parseFloat(t[0]);
                            power[i] = 1;
                        }
                    } else {
                        t = parts[i].split("x\\^");
                        power[i] = Integer.parseInt(t[1]);
                        if (!t[0].equals("")) {
                            if (!t[0].equals("-")) {
                                coef[i] = Float.parseFloat(t[0]);
                            } else {
                                coef[i] = -1.0F;
                            }
                        } else {
                            coef[i] = 1.0F;
                        }
                    }
                }
            }

            if (coef[i] != 0.0F || power[i] != 0) {
                Term var8 = new Term(coef[i], power[i]);
                p.addTerm(var8);
            }
        }

        return p;
    }

    public static String toString(Polynomial p) {
        String result = new String();
        Iterator var3 = p.getTerms().iterator();

        while (var3.hasNext()) {
            Term term = (Term) var3.next();
            if (term.getCoeff() != 0.0F) {
                if (term.getDegree() == 0) {
                    if (term.getCoeff() < 0.0F) {
                        result = result + term.getCoeff();
                    } else {
                        result = result + "+" + term.getCoeff();
                    }
                } else if (term.getDegree() == 1) {
                    if (term.getCoeff() < 0.0F) {
                        result = result + term.getCoeff() + "x";
                    } else {
                        result = result + "+" + term.getCoeff() + "x";
                    }
                } else if (term.getCoeff() < 0.0F) {
                    result = result + term.getCoeff() + "x" + "^" + term.getDegree();
                } else {
                    result = result + "+" + term.getCoeff() + "x" + "^" + term.getDegree();
                }
            }
        }

        return result;
    }
}
