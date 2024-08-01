package com.javarush.subbotin.controller;

import com.javarush.subbotin.command.Action;
import com.javarush.subbotin.entity.Result;
import com.javarush.subbotin.entity.ResultCode;
import com.javarush.subbotin.exception.AppException;

public class MainController {

    //задача MainController найти полученную команду и выполнить её с заданными параметрами
    public Result doAction(String actionName, String[] parameters) {
        //action == encode
        //parameters == [text.txt, encode.txt, 12]
        Action action = Actions.findAction(actionName);//ищем переданное действие и сохраняем encode and decode в интерфейс Action
        try {
            return action.execute(parameters);
        } catch (NullPointerException | AppException e) {
            return new Result(ResultCode.ERROR, e.getMessage());
        }

    }
}