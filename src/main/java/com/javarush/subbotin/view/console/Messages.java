package com.javarush.subbotin.view.console;

import static com.javarush.subbotin.constant.Const.*;

public interface Messages {

    String[][][] QUESTIONS = new String[][][]{
            {
                    {ENCODE},
                    {"Enter source (full path OR only filename OR Enter for text.txt) :", "text.txt"},
                    {"Enter destination (full path OR only filename OR Enter for encrypted.txt) :", "encrypted.txt"},
                    {"Enter key (int number OR Enter for key=1) :", "1"},
            },
            {
                    {DECODE},
                    {"Enter source (full path OR only filename OR Enter for encrypted.txt) :", "encrypted.txt"},
                    {"Enter destination (full path OR only filename OR Enter for decrypted.txt) :", "decrypted.txt"},
                    {"Enter key (int number OR Enter for key=1) :", "1"},
            },
            {
                    {EXIT},
            }
    };

    String INCORRECT_SELECTION = "Incorrect selection";

    String OK_FORMAT = """
                Operation complete
                Result: %s
            """;

    String ERR_FORMAT = """
                ERROR
                Message: %s
            """;
}