package com.javarush.subbotin.view.console;

import com.javarush.subbotin.entity.ResultCode;
import com.javarush.subbotin.controller.MainController;
import com.javarush.subbotin.entity.Result;

import java.util.Arrays;

public class Application {

    private final MainController mainController;
    private final Menu menu;

    public Application(MainController mainController, Menu menu) {
        this.mainController = mainController;
        this.menu = menu;
    }

    public void run() {
        Result result;
        do {
            String[] args = menu.getArgs();

            String action = args[0];
            String[] parameters = Arrays.copyOfRange(args, 1, args.length);
            result = mainController.doAction(action, parameters);

            String message = switch (result.resultCode) {
                case OK -> String.format(Messages.OK_FORMAT, result.message);

                case ERROR -> String.format(Messages.ERR_FORMAT, result.message);
            };
            System.out.println(message);

        } while (result.resultCode == ResultCode.ERROR);

    }
}
