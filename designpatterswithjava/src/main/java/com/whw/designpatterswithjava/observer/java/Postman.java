package com.whw.designpatterswithjava.observer.java;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体被观察者
 */
public class Postman implements Observable {

    //保存观察者列表
    private List<Observer> personList=new ArrayList<>();

    @Override
    public void add(Observer observer) {
        personList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        personList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer:personList){
            observer.update(message);
        }
    }
}
