package com.example.hangman;

import java.util.Random;

public class WordManager {
    private String[] words = {"polymorphism", "inheritance", "encapsulation", "abstraction", "interface"};
    private Random random = new Random();

    public String getRandomWord() {
        return words[random.nextInt(words.length)];
    }
}
