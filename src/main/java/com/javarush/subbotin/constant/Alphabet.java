package com.javarush.subbotin.constant;

import java.util.HashMap;
import java.util.Map;

public class Alphabet {

    private Alphabet() {
    }

    private static final String RUS = "АБВГДЕËЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String PUNCTUATION_MARKS = "!@#$%^&*(){}[]:;";

    public static final char[] ALPHABET = (RUS.toLowerCase() + PUNCTUATION_MARKS).toCharArray();

    public final static Map<Character, Integer> index = new HashMap<>();

    static {
        for (int i = 0; i < ALPHABET.length; i++) {
            index.put(ALPHABET[i], i);
        }
    }
}