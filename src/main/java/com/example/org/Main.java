package com.example.org;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(4, 4);
        matrix.setValueAt(0,0,3);
        matrix.setValueAt(1, 0, 2);
        matrix.setValueAt(2,0,1);
        matrix.setValueAt(0,1,5);
        matrix.setValueAt(3,0,6);


        Iterator iteratorMatrix = matrix.iterator();

        int count = 0;

        while (iteratorMatrix.hasNext()) {
            Integer element = (Integer) iteratorMatrix.next();
            if (count < matrix.getN()) {
                System.out.print(element + " ");
                count++;
            }
            else {
                System.out.println();
                count = 1;
                System.out.print(element + " ");
            }
        }
    }
}