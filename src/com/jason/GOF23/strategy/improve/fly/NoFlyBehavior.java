package com.jason.GOF23.strategy.improve.fly;

public class NoFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println(" 不会飞翔.. ");

    }
}
