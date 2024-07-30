package com.javarush.subbotin.controllers;

import com.javarush.subbotin.commands.Action;
import com.javarush.subbotin.commands.Decoder;
import com.javarush.subbotin.commands.Encoder;
import com.javarush.subbotin.exceptions.AppException;

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