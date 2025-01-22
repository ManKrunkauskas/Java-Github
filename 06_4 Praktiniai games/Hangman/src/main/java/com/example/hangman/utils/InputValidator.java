package com.example.hangman.utils;

public class InputValidator {
    public static boolean isValidGuess(String input) {
        return input.length() == 1 && Character.isLetter(input.charAt(0));
    }
}
