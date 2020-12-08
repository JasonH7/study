package com.jason.GOF23.strategy.improve;

import com.jason.GOF23.strategy.improve.duck.Duck;
import com.jason.GOF23.strategy.improve.duck.WildDuck;
import com.jason.GOF23.strategy.improve.fly.BadFlyBehavior;

public class Client {
    public static void main(String[] args) {
        //改变类 不同对象的不同属性
        Duck duck = new WildDuck();
        duck.setFlyBehavior(new BadFlyBehavior());
        duck.fly();
    }

}
