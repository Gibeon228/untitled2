package org.example;

public class MyHorse {
    static int n = 5;
    static int help = 0;
    static int[][] board = new int[n][n];
    static int[][] moves = {{1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {2, 1}, {2, -1}, {-2, 1}, {-2, -1}};
    static int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                movesHorse(i, j);
                printArray(board);
                System.out.println();
                count = 0;
            }
        }
    }

    public static boolean movesHorse(int row, int col) {
        if ((row < 0) || (row >= board.length) || (col < 0) || (col >= board.length)) return false;
        if (board[row][col] != 0) return false;

        count++;
        board[row][col] = count;

        if (count == board.length * board.length) {
            return true;
        }

        for (int i = 0; i < 8; i++) {
            if (movesHorse(row + moves[i][0], col + moves[i][1])) {
                return true;
            }
        }
        count--;
        board[row][col] = 0;
        return false;
    }

    public static void printArray(int[][] array) {
        if (array[0][0] == 0) return;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf(" %2d", array[i][j]);
                array[i][j] = 0;
            }
            System.out.println();
        }
    }

}