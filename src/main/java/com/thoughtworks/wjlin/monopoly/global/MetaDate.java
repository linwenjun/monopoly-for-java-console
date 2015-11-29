package com.thoughtworks.wjlin.monopoly.global;

public class MetaDate {
    private int funds;
    private static MetaDate instance;

    private MetaDate() {
    }

    public static MetaDate getInstance() {
        if(null == instance) {
            instance = new MetaDate();
        }

        return instance;
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }
}
