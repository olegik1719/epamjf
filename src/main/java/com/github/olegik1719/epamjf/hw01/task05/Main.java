package com.github.olegik1719.epamjf.hw01.task05;

public class Main {
    public static  int[][] getMatrix(int size){
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j|| i == size - 1 -j)
                    result[i][j] = 1;
                else result[i][j] = 0;
            }
        }
        return result;
    }
}
