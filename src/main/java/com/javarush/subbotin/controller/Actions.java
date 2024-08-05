package com.javarush.subbotin.controller;

import com.javarush.subbotin.command.Action;
import com.javarush.subbotin.command.Decoder;
import com.javarush.subbotin.command.Encoder;
import com.javarush.subbotin.command.Exit;
import com.javarush.subbotin.exception.AppException;

import static com.javarush.subbotin.constant.Const.NOT_FOUND_ACTION_FORMAT;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder()),
    EXIT(new Exit());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action findAction(String actionName) {
        try {
            Actions value = Actions.valueOf(actionName.toUpperCase());
            return value.action;
        } catch (IllegalArgumentException e) {
            String message = String.format(NOT_FOUND_ACTION_FORMAT, actionName);
            throw new AppException(message, e);
        }
    }
}