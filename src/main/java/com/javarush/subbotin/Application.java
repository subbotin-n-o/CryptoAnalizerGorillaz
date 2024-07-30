package com.javarush.subbotin;

import com.javarush.subbotin.controllers.MainController;
import com.javarush.subbotin.entity.Result;
import com.javarush.subbotin.exceptions.AppException;

import java.util.Arrays;

public class Application {

    private final MainController mainController;

    public Application() {
        mainController = new MainController();
    }

    public Result run(String[] args) {
        //encode    text.txt    encode.txt  12  эти параметры прилетели сюда!!!
        if (args.length > 0) {  //если массив args не пустой
            String action = args[0];    //то сохраняем в переменную action 0й элемент, который содержит "команду" encode
            String[] parameters = Arrays.copyOfRange(args, 1, args.length); //создаём массив параметров и достаём их из args, кроме 0го
            return mainController.doAction(action, parameters);    //mainController выполняет действие, которое ему прислали с параметрами
        } else {
        throw new AppException("no args");
        }
    }
}
