package com.samuelale.practice;
import java.util.Scanner;


public class MatrixFlip {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int t=0; t<T; t++) {
            int n = s.nextInt();
            int[][] mat = new int[2*n][2*n];
            for(int i=0; i<2*n; i++) {
                for(int j=0; j<2*n; j++) {
                    mat[i][j] = s.nextInt();
                }
            }

           
            int maxVal = 0;
            int len = 2*n-1;
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    // for i,j; we also consider: (n-i, j) & (i, n-j) & (n-i, n-j)
                    int v1 = mat[i][j];
                    int v2 = mat[len-i][j];
                    int v3 = mat[i][len-j];
                    int v4 = mat[len-i][len-j];
                    maxVal += Math.max(v1, Math.max(v2, Math.max(v3, v4)));
                }
            }

            System.out.println(maxVal);
        }
    }
}
