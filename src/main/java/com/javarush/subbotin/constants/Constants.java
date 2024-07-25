package com.javarush.subbotin.constants;

public class Constants {

    private static final String RUS = "АБВГДЕËЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String ENG = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String CYPHER = "0123456789";
    private static final String PUNCTUATION_MARKS = "!@#$%^&*(){}[]:;";

    public static final String ALPHABET = RUS + RUS.toLowerCase() + ENG + ENG.toLowerCase() + CYPHER + PUNCTUATION_MARKS;

}