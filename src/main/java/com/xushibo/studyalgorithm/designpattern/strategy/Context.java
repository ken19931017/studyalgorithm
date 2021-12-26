package com.xushibo.studyalgorithm.designpattern.strategy;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(String data){
        strategy.setData(data);
        strategy.execute();
    }
}
