package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.company.Term;
import com.company.TermComparator;

/**
 * Created by George Cimpoies on 10/13/2016.
 */

public class Polynomial {
    private List<Term> terms = new ArrayList();

    public Polynomial() {
    }

    public Polynomial(Polynomial p) {
        Iterator var3 = p.getTerms().iterator();

        while (var3.hasNext()) {
            Term t = (Term) var3.next();
            this.terms.add(new Term(t.getCoeff(), t.getDegree()));
        }

    }

    public void sort() {
        Collections.sort(this.terms, new TermComparator());
    }

    public void addTerm(Term t) {
        boolean termExists = false;
        Iterator var4 = this.terms.iterator();

        while (var4.hasNext()) {
            Term currentT = (Term) var4.next();
            if (currentT.getDegree() == t.getDegree()) {
                float coeff = currentT.getCoeff();
                currentT.setCoeff(coeff + t.getCoeff());
                termExists = true;
                break;
            }
        }

        if (!termExists) {
            this.terms.add(new Term(t));
        }

    }

    public List<Term> getTerms() {
        return this.terms;
    }

    public void setTerms(List<Term> terms) {
        this.terms = terms;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator var3 = this.terms.iterator();

        while (var3.hasNext()) {
            Term t = (Term) var3.next();
            if (t.getCoeff() > 0.0F) {
                sb.append("+");
            }

            sb.append(t.getCoeff());
            sb.append("x^");
            sb.append(t.getDegree());
        }

        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (!(obj instanceof Polynomial)) {
            return false;
        } else {
            Polynomial that = (Polynomial) obj;
            return that.terms.equals(this.terms);
        }
    }
}