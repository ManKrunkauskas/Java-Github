package com.example.tictactoe;

import java.util.Scanner;

public class GameLogic {
    private Board board;
    private char currentPlayer;

    public GameLogic() {
        board = new Board();
        currentPlayer = 'X';
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;

        while (!gameWon && !board.isFull()) {
            board.printBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row [0-2] and column [0-2]): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (board.makeMove(row, col, currentPlayer)) {
                gameWon = board.checkWin(currentPlayer);
                if (!gameWon) {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        board.printBoard();

        if (gameWon) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else {
            System.out.println("It's a draw!");
        }

        scanner.close();
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}
