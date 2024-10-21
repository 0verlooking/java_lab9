package com.chmnu_ki_123.c3;

public class MatrixSymmetry {
    public static boolean isSymmetric(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Перевіряємо тільки верхню половину
                if (matrix[i][j] != matrix[j][i]) {
                    return false; // Якщо знайдено несумісність
                }
            }
        }
        return true; // Матриця симетрична
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {2, 1, 4},
                {3, 4, 1}
        };

        System.out.println("Матриця є симетричною: " + isSymmetric(matrix));
    }
}
