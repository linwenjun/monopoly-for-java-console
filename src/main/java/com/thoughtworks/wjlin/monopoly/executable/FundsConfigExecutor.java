package com.thoughtworks.wjlin.monopoly.executable;

import com.thoughtworks.wjlin.monopoly.command.CommandGenerator;
import com.thoughtworks.wjlin.monopoly.global.MetaDate;

public class FundsConfigExecutor implements Executor {

    @Override
    public void execute() {
        int funds;

        System.out.print("请设置玩家初始资金,范围1000~50000:");

        String fundsStr = CommandGenerator.generator();

        if(fundsStr.equals("")) {
            funds = 10000;
        } else {
            while(true) {
                try {
                    funds = Integer.valueOf(fundsStr);
                    if(funds < 1000 || funds > 50000) {
                        throw new NumberFormatException();
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("无效的输入！请重新输入:");
                }
            }
        }

        MetaDate.getInstance().setFunds(funds);
    }

    public Executor next() {
        return new PlayerCountConfigExecutor();
    }
}
