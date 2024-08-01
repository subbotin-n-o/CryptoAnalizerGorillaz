package com.javarush.subbotin.controller;

import com.javarush.subbotin.command.Action;
import com.javarush.subbotin.command.Decoder;
import com.javarush.subbotin.command.Encoder;
import com.javarush.subbotin.exception.AppException;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action findAction(String actionName) {
        try {
            Actions value = Actions.valueOf(actionName.toUpperCase());
            return value.action;
        } catch (IllegalArgumentException e) {
            throw new AppException("not found " + actionName, e);
        }
    }
}