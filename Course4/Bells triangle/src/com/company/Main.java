package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] triang = new int[100][100];
        int n = 5;
        triang[1][1] = 1;
        triang[2][1] = 1;
        triang[2][2] = 2;
        for (int i = 3; i <= n; i++)
            for (int j = 1; j <= n; j++)
                if (j == 1)
                    triang[i][j] = triang[i - 1][i - 1];
                else
                    triang[i][j] = triang[i][j - 1] + triang[i - 1][j - 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                if (triang[i][j] != 0)
                    System.out.print(triang[i][j] + " ");
            System.out.println();
        }
    }
}
