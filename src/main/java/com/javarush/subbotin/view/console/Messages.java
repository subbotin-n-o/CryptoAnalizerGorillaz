package com.javarush.subbotin.view.console;

import com.javarush.khmelov.constant.Const;

public interface Messages {

    String[][][] QUESTIONS = new String[][][]{
            {
                    {Const.ENCODE},
                    {"Enter source (full path OR only filename OR Enter for text.txt) :", "text.txt"},
                    {"Enter destination (full path OR only filename OR Enter for encrypted.txt) :", "encrypted.txt"},
                    {"Enter key (int number OR Enter for key=1) :", "1"},
            },
            {
                    {Const.DECODE},
                    {"Enter source (full path OR only filename OR Enter for encrypted.txt) :", "encrypted.txt"},
                    {"Enter destination (full path OR only filename OR Enter for decrypted.txt) :", "decrypted.txt"},
                    {"Enter key (int number OR Enter for key=1) :", "1"},
            },
            {
                    {"Exit"},
            }
    };

    String OK_FORMAT = """
                Operation complete
                Result: %s
            """;

    String ERR_FORMAT = """
                ERROR
                Message: %s
            """;
}