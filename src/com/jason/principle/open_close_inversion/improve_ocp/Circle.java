package com.jason.principle.open_close_inversion.improve_ocp;

public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
