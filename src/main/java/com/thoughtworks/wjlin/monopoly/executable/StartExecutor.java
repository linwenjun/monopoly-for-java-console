package com.thoughtworks.wjlin.monopoly.executable;

public class StartExecutor implements Executor {

    private Executor next;

    @Override
    public void execute() {
        // 设置玩家人数
        next = null;
    }

    public Executor next() {
        return next;
    }
}
