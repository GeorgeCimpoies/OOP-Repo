package com.company;

import java.util.Iterator;

import com.company.Polynomial;
import com.company.Term;

/**
 * Created by George Cimpoies on 10/13/2016.
 */
public class Operations {
    public Operations() {
    }

    public static Polynomial Add(Polynomial p1, Polynomial p2) {
        Polynomial result = new Polynomial(p1);
        Iterator var4 = p2.getTerms().iterator();

        while (var4.hasNext()) {
            Term term = (Term) var4.next();
            result.addTerm(term);
        }

        return result;
    }

    public static Polynomial Sub(Polynomial p1, Polynomial p2) {
        Polynomial result = new Polynomial(p1);
        Iterator var4 = p2.getTerms().iterator();

        while (var4.hasNext()) {
            Term term = (Term) var4.next();
            float coeff = term.getCoeff();
            term.setCoeff(-1.0F * coeff);
            result.addTerm(term);
        }

        return result;
    }

    public static Polynomial Multiplication(Polynomial p1, Polynomial p2) {
        Polynomial result = new Polynomial();
        Iterator var4 = p1.getTerms().iterator();

        while (var4.hasNext()) {
            Term term1 = (Term) var4.next();
            float coeff1 = term1.getCoeff();
            int degree1 = term1.getDegree();
            Iterator var8 = p2.getTerms().iterator();

            while (var8.hasNext()) {
                Term term2 = (Term) var8.next();
                float coeff2 = term2.getCoeff();
                int degree2 = term2.getDegree();
                Term t = new Term(coeff2 * coeff1, degree1 + degree2);
                result.addTerm(t);
            }
        }

        return result;
    }

    public static Polynomial Derivation(Polynomial p) {
        Polynomial result = new Polynomial();
        Iterator var3 = p.getTerms().iterator();

        while (var3.hasNext()) {
            Term term = (Term) var3.next();
            float coeff = term.getCoeff();
            int degree = term.getDegree();
            if (degree - 1 >= 0) {
                Term t = new Term(coeff * (float) degree, degree - 1);
                result.addTerm(t);
            }
        }

        return result;
    }

    public static Polynomial Integration(Polynomial p) {
        Polynomial result = new Polynomial();
        Iterator var3 = p.getTerms().iterator();

        while (var3.hasNext()) {
            Term term = (Term) var3.next();
            float coeff = term.getCoeff();
            int degree = term.getDegree();
            Term t = new Term(coeff / (float) (1 + degree), degree + 1);
            result.addTerm(t);
        }

        return result;
    }
}
