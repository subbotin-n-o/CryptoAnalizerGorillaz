package com.javarush.subbotin.commands;

import com.javarush.subbotin.entity.Result;

public interface Action {

    Result execute(String[] parameters);

}