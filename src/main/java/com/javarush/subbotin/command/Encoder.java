package com.javarush.subbotin.command;

import com.javarush.subbotin.entity.Result;

public class Encoder extends AbstractAction{

    @Override
    public Result execute(String[] parameters) {
        String sourceTextFile = parameters[0];
        String targetTextFile = parameters[1];
        int keyCode = Integer.parseInt(parameters[2]);
        return copyWithKey(sourceTextFile, targetTextFile, keyCode);
    }
}