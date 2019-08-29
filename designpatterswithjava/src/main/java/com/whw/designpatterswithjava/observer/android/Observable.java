package com.whw.designpatterswithjava.observer.android;

/**
 * 被观察者
 */
public interface Observable {

    void add(Observer observer);

    void remove(Observer observer);

    void notify(String message);


}
