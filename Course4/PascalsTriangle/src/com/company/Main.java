package com.company;

public class Main {

    public static void main(String[] args) {
        int triang[][] = new int[100][100];
        int numberOfLines = 6;
        triang[1][1] = 1;
        triang[2][1] = 1;
        triang[2][2] = 1;
        for (int i = 1; i <= numberOfLines; i++)
            for (int j = 1; j <= i; j++)
                if (j == 1)
                    triang[i][j] = 1;
                else
                    triang[i][j] = triang[i - 1][j - 1] + triang[i - 1][j];

        for (int i = 1; i <= numberOfLines; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(triang[i][j] + " ");
            System.out.println();
        }
    }
}
