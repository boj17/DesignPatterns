package com.whw.designpatterns.builder.builder1

/**
 * 使用者Director -- 电脑装机人员
 */
class Director(var mBuilder:ComputerConfigBuilder) {

    fun createComputer(){
        mBuilder.setCpu()
        mBuilder.setMemery()
        mBuilder.setHardDisk()
        mBuilder.setKeyboard()
        mBuilder.setMouse()
    }

    fun getComputer():Computer{
        return mBuilder.getComputer()
    }
}