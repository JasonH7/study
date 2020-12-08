package com.jason.GOF23.adapter.simple_springmvc;
import com.jason.GOF23.adapter.simple_springmvc.adapter.AnnotationHandlerAdapter;
import com.jason.GOF23.adapter.simple_springmvc.adapter.HandlerAdapter;
import com.jason.GOF23.adapter.simple_springmvc.adapter.HttpHandlerAdapter;
import com.jason.GOF23.adapter.simple_springmvc.adapter.SimpleHandlerAdapter;
import com.jason.GOF23.adapter.simple_springmvc.controller.Controller;
import com.jason.GOF23.adapter.simple_springmvc.controller.HttpController;

import java.util.ArrayList;
import java.util.List;


public class DispachServlet {
    //1.拿到适配器组
   public List<HandlerAdapter> handlerAdapters = new ArrayList<>();
    //2.构造器内组合适配器
    public DispachServlet(){
       handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }
    // 两个接口之间产生互动
    // !!获取适配器 遍历适配器组
    // 选择controller
    public  HandlerAdapter getHandler(Controller controller){
        for(HandlerAdapter adapter : this.handlerAdapters){
            if(adapter.support(controller)){
                //满足条件进行操作
               return adapter;
            }
        }
        return null;
    }
    //开始分发
    public  void doDispach(Controller controller){
       // MainInvoker controller = new HttpController();
        HandlerAdapter autoAdapter = getHandler(controller);
        //适配器调用controller
        autoAdapter.handle(controller);
    }

    //填入参数进行分发
    public static void main(String[] args) {
        DispachServlet servlet = new DispachServlet();
        servlet.doDispach(new HttpController());
    }
}
