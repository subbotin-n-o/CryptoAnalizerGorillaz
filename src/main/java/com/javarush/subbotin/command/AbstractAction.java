package com.javarush.subbotin.command;

import com.javarush.subbotin.constant.Alphabet;
import com.javarush.subbotin.entity.Result;
import com.javarush.subbotin.entity.ResultCode;
import com.javarush.subbotin.exception.AppException;
import com.javarush.subbotin.util.PathBuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.javarush.subbotin.constant.Const.INCORRECT_FILE;

public abstract class AbstractAction implements Action {

    public Result copyWithKey(String sourceTextFile, String targetTextFile, int key) {
        Path source = PathBuilder.get(sourceTextFile);
        Path target = PathBuilder.get(targetTextFile);
        try (
                BufferedReader reader = Files.newBufferedReader(source);
                BufferedWriter writer = Files.newBufferedWriter(target);
                ) {
            int value;
            int length = Alphabet.ALPHABET.length;
            while ((value = reader.read()) > -1) {
                char character = (char) value;
                character = Character.toLowerCase(character);
                if (Alphabet.index.containsKey(character)) {
                    Integer index = Alphabet.index.get(character);
                    index = (index + key + Math.abs(key) * length) % length;
                    writer.write(Alphabet.ALPHABET[index]);
                } else if (character == '\n') {
                    writer.write(character);
                }
            }

        } catch (IOException e) {
            throw new AppException(INCORRECT_FILE + e.getMessage(), e);
        }
        return new Result(ResultCode.OK, targetTextFile);
    }

}