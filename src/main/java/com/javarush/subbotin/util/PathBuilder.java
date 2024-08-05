package com.javarush.subbotin.util;

import java.nio.file.Path;

import static com.javarush.subbotin.constant.Const.TXT_FOLDER;

public class PathBuilder {

    private PathBuilder() {
    }

    public static Path get(String filename) {
        Path path = Path.of(filename);
        return path.isAbsolute()
                ? path
                : Path.of(TXT_FOLDER + filename);
    }
}