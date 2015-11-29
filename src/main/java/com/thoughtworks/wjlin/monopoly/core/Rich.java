package com.thoughtworks.wjlin.monopoly.core;

import com.thoughtworks.wjlin.monopoly.executable.Executor;
import com.thoughtworks.wjlin.monopoly.executable.FundsConfigExecutor;

public class Rich {
    public static void main(String [] args) {
        Executor executor = new FundsConfigExecutor();

        while(null != executor) {
            executor.execute();
            executor = executor.next();
        }
    }
}
