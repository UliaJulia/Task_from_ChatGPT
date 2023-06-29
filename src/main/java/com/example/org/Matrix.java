package com.example.org;

import java.util.Arrays;
import java.util.Iterator;

public class Matrix implements Iterable{
    private int n;
    private int m;

    int[][] matrix;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        matrix = new int[n][m];
        for (int[] row : matrix) {
            Arrays.fill(row, 0);
        }
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public void setValueAt(int i, int j, int value) {
        matrix[i][j] = value;
    }

    public int getValueAt(int i, int j) {
        return matrix[i][j];
    }

    public void multiplyByScalar(int scalar) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] *= scalar;
            }
        }
    }

    public void add(Matrix matrix) {
        int[][] summa = new int[n][m];
        if (this.m == matrix.m && this.n == matrix.n) {
            for (int i = 0; i < summa.length; i++) {
                for (int j = 0; j < summa[i].length; j++) {
                    summa[i][j] = this.matrix[i][j] + matrix.matrix[i][j];
                    System.out.print(summa[i][j] + " ");
                }
                System.out.println();
            }
        }
        for (int[] row : summa) {
            Arrays.fill(row, 0);
        }
    }

    public void transpose() {
        int bob = 0;
        int[][] transpose = new int[this.m][this.n];
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                transpose[j][i] = this.matrix[i][j];
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public Iterator iterator() {
        return new IteratorMatrix(this);
    }
}
