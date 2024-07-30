package com.javarush.subbotin.commands;

import com.javarush.subbotin.entity.Result;
import com.javarush.subbotin.entity.ResultCode;

public class Decoder implements Action {

    @Override
    public Result execute(String[] parameters) {
        //TODO something do
        return new Result("decode all right", ResultCode.OK);
    }
}