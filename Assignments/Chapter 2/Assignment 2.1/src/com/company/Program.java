package com.company;

/**
 * Created by George Cimpoies on 10/13/2016.
 */

import com.company.Polynomial;
import com.company.PolynomialString;
import com.company.Operations;
import com.company.Term;
import com.company.TermComparator;

public class Program {
    public static void main(String[] args) {

        Polynomial a = new Polynomial();
        Polynomial b = new Polynomial();
        Term x = new Term(8, 9);
        Term c = new Term(2, 3);

        a.addTerm(z);
        a.addTerm(x);

        b.addTerm(x);
        b.addTerm(c);

        Operations op1 = new Operations();

        System.out.println("Polynomial a: " + a);
        System.out.println("Polynomial b: " + b);
        System.out.println();
        System.out.println("Addition: " + op1.Add(a, b));
        System.out.println("Subtraction: " + op1.Sub(a, b));
        System.out.println("Multiplication: " + op1.Multiplication(a, b));


    }
}
