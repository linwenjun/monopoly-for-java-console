package com.thoughtworks.wjlin.monopoly.core;

import com.thoughtworks.wjlin.monopoly.executable.Executor;
import com.thoughtworks.wjlin.monopoly.executable.StartExecutor;

public class Rich {
    public static void main(String [] args) {
        Executor executor = new StartExecutor();

        while(null != executor) {
            executor.execute();
            executor = executor.next();
        }
    }
}
