package com.whw.designpatterns.builder.builder1

/**
 * 2 抽象的Builder -- 装CPU、内存条、硬盘等抽象的步骤
 * 对安装功能进行抽象
 */
interface ComputerConfigBuilder {
    fun setCpu()
    fun setMemery()
    fun setHardDisk()
    fun setKeyboard()
    fun setMouse()
    fun getComputer():Computer
}