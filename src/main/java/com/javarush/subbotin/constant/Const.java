package com.javarush.subbotin.constant;

import java.io.File;

public interface Const {
    String ENCODE = "encode";
    String DECODE = "decode";
    String EXIT = "exit";

    String TXT_FOLDER = System.getProperty("user.dir") +
            File.separator +
            "text" +
            File.separator;

    String NOT_FOUND_ACTION_FORMAT = "not found action: %s";
    String INCORRECT_FILE = "Incorrect file: ";
    String APPLICATION_CLOSED = "application closed";
}