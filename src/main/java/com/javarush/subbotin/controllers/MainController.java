package com.javarush.subbotin.controllers;

import com.javarush.subbotin.commands.Action;
import com.javarush.subbotin.entity.Result;

public class MainController {

    //задача MainController найти полученную команду и выполнить её с заданными параметрами
    public Result doAction(String actionName, String[] parameters) {
        //action == encode
        //parameters == [text.txt, encode.txt, 12]
        Action action = Actions.findAction(actionName); //ищем переданное действие и сохраняем encode and decode в интерфейс Action
        return action.execute(parameters);
    }
}