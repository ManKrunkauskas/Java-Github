package com.example.tictactoe.utils;

public class InputValidator {
    public static boolean isValidMove(int row, int col, char[][] board) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }
}
