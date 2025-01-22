package com.example.hangman;

import com.example.hangman.utils.BoardPrinter;

import java.util.Scanner;

public class GameLogic {
    private WordManager wordManager = new WordManager();
    private Scanner scanner = new Scanner(System.in);

    public void startGame() {
        boolean playAgain = true;

        while (playAgain) {
            String word = wordManager.getRandomWord();
            char[] guessedWord = new char[word.length()];
            for (int i = 0; i < guessedWord.length; i++) guessedWord[i] = '*';

            int misses = 0;

            while (!String.valueOf(guessedWord).equals(word)) {
                BoardPrinter.printBoard(guessedWord);
                System.out.print("Enter a letter: ");
                char guess = scanner.next().charAt(0);

                if (word.indexOf(guess) >= 0) {
                    updateGuessedWord(word, guessedWord, guess);
                } else {
                    System.out.println(guess + " is not in the word.");
                    misses++;
                }
            }

            System.out.println("You guessed the word: " + word);
            System.out.println("Misses: " + misses);

            System.out.print("Play again? (y/n): ");
            playAgain = scanner.next().equalsIgnoreCase("y");
        }
    }

    private void updateGuessedWord(String word, char[] guessedWord, char guess) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                guessedWord[i] = guess;
            }
        }
    }
}
