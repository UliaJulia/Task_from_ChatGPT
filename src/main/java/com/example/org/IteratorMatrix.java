package com.example.org;

import java.util.Iterator;

public class IteratorMatrix implements Iterator {

    private Matrix matrix;
    private int i = 0;
    private int j = 0;

    public IteratorMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public boolean hasNext() {
        return i < matrix.getN() && j < matrix.getM();
    }

    @Override
    public Integer next() {
        int element = matrix.matrix[i][j];
        j++;
        if (j == matrix.getM() && i < matrix.getN()) {
            j = 0;
            i++;
        }
        return element;
    }
}
