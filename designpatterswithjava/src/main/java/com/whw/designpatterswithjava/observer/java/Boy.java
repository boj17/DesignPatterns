package com.whw.designpatterswithjava.observer.java;

/**
 * 具体观察者1
 */
public class Boy implements Observer {

    private String name;

    public Boy(String name){
        this.name=name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + ",收到了信息:" + message+"屁颠颠的去取快递.");
    }
}
