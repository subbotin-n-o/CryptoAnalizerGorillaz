package com.javarush.subbotin.command;

import com.javarush.subbotin.entity.Result;
import com.javarush.subbotin.entity.ResultCode;

import static com.javarush.subbotin.constant.Const.APPLICATION_CLOSED;

public class Exit extends AbstractAction {

    @Override
    public Result execute(String[] parameters) {
        return new Result(ResultCode.OK, APPLICATION_CLOSED);
    }
}