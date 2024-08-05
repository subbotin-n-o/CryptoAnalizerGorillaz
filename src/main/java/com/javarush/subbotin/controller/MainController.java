package com.javarush.subbotin.controller;

import com.javarush.subbotin.command.Action;
import com.javarush.subbotin.entity.Result;
import com.javarush.subbotin.entity.ResultCode;
import com.javarush.subbotin.exception.AppException;

public class MainController {

    public Result doAction(String actionName, String[] parameters) {
        Action action = Actions.findAction(actionName);
        try {
            return action.execute(parameters);
        } catch (NullPointerException | AppException e) {
            return new Result(ResultCode.ERROR, e.getMessage());
        }
    }
}