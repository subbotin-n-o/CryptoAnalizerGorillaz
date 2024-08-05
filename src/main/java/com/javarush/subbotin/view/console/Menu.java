package com.javarush.subbotin.view.console;

import java.util.Scanner;

import static com.javarush.subbotin.view.console.Messages.INCORRECT_SELECTION;
import static com.javarush.subbotin.view.console.Messages.QUESTIONS;

public class Menu {

    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public String[] getArgs() {
        int mode = getMode(scanner);
        String[] args = new String[QUESTIONS[mode].length];
        args[0] = QUESTIONS[mode][0][0];
        for (int i = 1; i < args.length; i++) {
            String quest = QUESTIONS[mode][i][0];
            System.out.println(quest);
            String answer = scanner.nextLine();
            args[i] = "".equals(answer.trim())
                    ? QUESTIONS[mode][i][1]
                    : answer;
        }
        return args;
    }

    private static int getMode(Scanner scanner) {
        int mode;
        do {
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("5. Exit");
            String input = scanner.nextLine();
            mode = switch (input) {
                case "1" -> 1;
                case "2" -> 2;
                case "3" -> 3;
                default -> {
                    System.out.println(INCORRECT_SELECTION);
                    yield -1;
                }
            };
        } while (mode < 0);
        return mode;
    }
}