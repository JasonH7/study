package com.jason.GOF23.factory.abstract_factory.pizza;

import com.jason.GOF23.factory.abstract_factory.order.BJFactory;
import com.jason.GOF23.factory.abstract_factory.order.OrderPizza;

//销售点
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza mOrder = new OrderPizza();
        //多态
        mOrder.productPizza(new BJFactory());

    }
}
