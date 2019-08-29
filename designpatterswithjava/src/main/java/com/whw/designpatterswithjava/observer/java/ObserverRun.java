package com.whw.designpatterswithjava.observer.java;

public class ObserverRun {

    public  static void main(String[] arrays){
        Observable postman=new Postman();
        Observer boy1=new Boy("路飞");
        Observer boy2=new Boy("乔巴");
        Observer girl=new Girl("娜美");
        postman.add(boy1);
        postman.add(boy2);
        postman.add(girl);
        postman.notify("拿快递啦各位");

    }
}
