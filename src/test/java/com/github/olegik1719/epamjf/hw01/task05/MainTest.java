package com.github.olegik1719.epamjf.hw01.task05;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    private static int[][] matrix1 = {{1}};
    private static int[][] matrix2 = {{1,1},{1,1}};
    private static int[][] matrix3 = {{1,0,1},{0,1,0},{1,0,1}};
    private static int[][] matrix4 = {{1,0,0,1},{0,1,1,0},{0,1,1,0},{1,0,0,1}};
    private static int[][] matrix5 = {{1,0,0,0,1},{0,1,0,1,0},{0,0,1,0,0},{0,1,0,1,0},{1,0,0,0,1}};

    @Test
    public void getMatrix() {
        assertArrayEquals(matrix1,Main.getMatrix(1));
        assertArrayEquals(matrix2,Main.getMatrix(2));
        assertArrayEquals(matrix3,Main.getMatrix(3));
        assertArrayEquals(matrix4,Main.getMatrix(4));
        assertArrayEquals(matrix5,Main.getMatrix(5));
    }
}