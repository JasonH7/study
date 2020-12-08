package com.jason.GOF23.factory.factory_method.order;

import com.jason.GOF23.factory.factory_method.pizza.BJCheesePizza;
import com.jason.GOF23.factory.factory_method.pizza.BJPepperPizza;
import com.jason.GOF23.factory.factory_method.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            //子类new
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            //子类new
            pizza = new BJPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }

}
