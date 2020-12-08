package com.jason.GOF23.strategy.improve.duck;

import com.jason.GOF23.strategy.improve.fly.GoodFlyBehavior;

public class WildDuck extends Duck {
    public WildDuck(){
        //!!!!
        flyBehavior = new GoodFlyBehavior();
    }
    @Override
    public void display() {
        System.out.println(" 这是野鸭 ");
    }
}
