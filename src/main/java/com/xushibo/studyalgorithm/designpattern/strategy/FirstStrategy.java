package com.xushibo.studyalgorithm.designpattern.strategy;

public class FirstStrategy implements Strategy{

    String data="";
    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void execute() {
        System.out.println(data);
    }
}
