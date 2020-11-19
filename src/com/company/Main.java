package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        int total = 0;
        int m = grid.length;
        int n = grid[0].length;
        int adj = 0;
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j <n; j++) {
                total += grid[i][j];
                if (grid[i][j] == 1) {
                    if (j<n-1 && grid[i][j + 1] == 1) {
                        adj += 1;
                    }
                    if (i<m-1 && grid[i + 1][j] == 1) {
                        adj += 1;
                    }
                }
            }
        }

        int p=total*4-2*adj;
        System.out.println(p);
    }
}
