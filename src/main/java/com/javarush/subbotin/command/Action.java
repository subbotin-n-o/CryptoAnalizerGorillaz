package com.javarush.subbotin.command;

import com.javarush.subbotin.entity.Result;

public interface Action {

    Result execute(String[] parameters);

}