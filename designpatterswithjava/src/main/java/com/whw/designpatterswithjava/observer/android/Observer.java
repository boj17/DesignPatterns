package com.whw.designpatterswithjava.observer.android;

/**
 * 观察者
 */
public interface Observer {
    /**
     * 更新
     * @param message
     */
    void update(String message);

}
