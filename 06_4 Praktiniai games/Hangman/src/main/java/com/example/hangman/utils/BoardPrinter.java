package com.example.hangman.utils;

public class BoardPrinter {
    public static void printBoard(char[] guessedWord) {
        System.out.println("Word: " + String.valueOf(guessedWord));
    }
}
