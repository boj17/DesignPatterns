package com.whw.designpatterswithjava.observer.java;

/**
 * 抽象观察者
 */
public interface Observer {
    /**
     * 更新
     * @param message
     */
    public void update(String message);

}
