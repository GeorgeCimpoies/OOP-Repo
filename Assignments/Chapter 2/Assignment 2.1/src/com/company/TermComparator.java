package com.company;

/**
 * Created by George Cimpoies on 10/13/2016.
 */

import java.util.Comparator;

import com.company.Term;

public class TermComparator implements Comparator<Term> {
    public TermComparator() {
    }

    public int compare(Term arg0, Term arg1) {
        return arg0.getDegree() < arg1.getDegree() ? 1 : (arg0.getDegree() > arg1.getDegree() ? -1 : 0);
    }
}
