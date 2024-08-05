package com.javarush.subbotin.constant;

import java.io.File;

public interface Const {
    String ENCODE = "encode";
    String DECODE = "decode";

    String TXT_FOLDER = System.getProperty("user.dir") +
            File.separator +
            "text" +
            File.separator;

    String INCORRECT_FILE = "Incorrect file: ";
}