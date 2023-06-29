package com.example.org;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MatrixTest {

    @Test
    void setValueAt() {
        Matrix matrix = new Matrix(3,3);
        matrix.setValueAt(2,2,2);

        int[][] expected = new int[3][3];
        for (int[] row :expected) {
            Arrays.fill(row, 0);
        }
        expected[2][2] = 2;

        Assert.assertEquals(expected, matrix.matrix);
    }

    @Test
    void getValueAt() {
        Matrix matrix = new Matrix(3,3);
        matrix.setValueAt(2,2,2);

        int expected = 2;
        Assert.assertEquals(expected, matrix.getValueAt(2, 2));
    }

    @Test
    void multiplyByScalar() {
        int scalar = 3;

        Matrix matrix = new Matrix(3,3);
        matrix.setValueAt(0,0,1);
        matrix.setValueAt(1,0,2);
        matrix.setValueAt(2,0,3);

        matrix.multiplyByScalar(scalar);

        int[][] expected = new int[3][3];
        for (int[] row :expected) {
            Arrays.fill(row, 0);
        }
        expected[0][0] = 1 * scalar;
        expected[1][0] = 2 * scalar;
        expected[2][0] = 3 * scalar;

        Assert.assertEquals(expected, matrix.matrix);
    }
}