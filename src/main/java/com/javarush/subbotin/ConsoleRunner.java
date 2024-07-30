package com.javarush.subbotin;

import com.javarush.subbotin.entity.Result;

public class ConsoleRunner {

    public static void main(String[] args) {
        //В ConsoleRunner пришли аргументы
        //encode    text.txt    encode.txt  12
        Application application = new Application();    //Создаем экземпляр класса Application
        Result result = application.run(args);  //<---- прилетает сюда в аргументы и запускает метод run()
        System.out.println(result);

    }
}