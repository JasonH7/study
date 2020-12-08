package com.jason.GOF23.visitor.relearn.visitor;

import com.jason.GOF23.visitor.relearn.elem.ConcreteElemA;
import com.jason.GOF23.visitor.relearn.elem.ConcreteElemB;

//抽象访问者
public interface Visitor {
    //需要体现出个性 而不是统一化操作
    default void visit(ConcreteElemA elementA){}
    default void visit(ConcreteElemB elementB){}
}
