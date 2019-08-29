package com.whw.designpatterswithjava.observer.android;

import java.util.ArrayList;
import java.util.List;

public class ObservableManger implements Observable {
    private  static ObservableManger instance;
    private List<Observer> list=new ArrayList<>();
    private ObservableManger(){

    }

    public static ObservableManger getIntanse(){
        if (instance==null){
            instance=new ObservableManger();
        }
        return instance;
    }

    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer:list){
            observer.update(message);
        }
    }
}
