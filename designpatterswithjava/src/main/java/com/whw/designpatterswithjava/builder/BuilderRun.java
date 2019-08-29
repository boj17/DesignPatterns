package com.whw.designpatterswithjava.builder;

public class BuilderRun {

    public static void main(String[] arrays){
        Computer computer= new Computer.Buidler().CPU("i7")
                .memory("16G")
                .hardDisk("1T")
                .keyboard("机械键盘")
                .mouse("无线鼠标")
                .builder();
        System.out.println(computer);

    }
}
