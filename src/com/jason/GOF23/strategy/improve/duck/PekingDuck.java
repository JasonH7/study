package com.jason.GOF23.strategy.improve.duck;

import com.jason.GOF23.strategy.improve.fly.BadFlyBehavior;

/**
 * 北京鸭会叫会游泳，但是不会飞翔
 * */
public class PekingDuck extends Duck {
    public PekingDuck(){
        flyBehavior = new BadFlyBehavior();
    }
    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }


}
