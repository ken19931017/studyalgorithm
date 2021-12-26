package com.xushibo.studyalgorithm.designpattern.strategy;

public class StrategyPatternTest {

    public static void main (String[] args){

      Context  context = new Context();
      context.setStrategy(new FirstStrategy());
      context.executeStrategy("first");

      context.setStrategy(new SecondStrategy());
      context.executeStrategy("second");
    }

}
