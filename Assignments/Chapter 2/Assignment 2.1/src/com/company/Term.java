package com.company;

/**
 * Created by George Cimpoies on 10/13/2016.
 */

public class Term {
    private float coeff;
    private int degree;

    public Term(float f, int g) {
        this.coeff = f;
        this.degree = g;
    }

    public Term(Term t) {
        this.coeff = t.coeff;
        this.degree = t.degree;
    }

    public float getCoeff() {
        return this.coeff;
    }

    public void setCoeff(float f) {
        this.coeff = f;
    }

    public int getDegree() {
        return this.degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        } else if(!(obj instanceof Term)) {
            return false;
        } else {
            Term that = (Term)obj;
            return that.coeff == this.coeff && that.degree == this.degree;
        }
    }
}
