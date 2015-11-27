package com.thoughtworks.wjlin.monopoly.executable;

public interface Executor {
    void execute();
    Executor next();
}
