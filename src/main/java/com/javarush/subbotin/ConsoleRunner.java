package com.javarush.subbotin;

import com.javarush.subbotin.controller.MainController;
import com.javarush.subbotin.view.console.Application;
import com.javarush.subbotin.view.console.Menu;

import java.util.Scanner;

public class ConsoleRunner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu(input);
        MainController mainController = new MainController();
        Application application = new Application(mainController, menu);
        application.run();

    }
}