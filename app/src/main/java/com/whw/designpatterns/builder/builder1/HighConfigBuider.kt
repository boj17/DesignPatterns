package com.whw.designpatterns.builder.builder1

/**
 * 高配版
 * Builder的具体实现ConcreteBuilder -- 对上述抽象步骤的实现，比如装i5CPU、8G内存条、1T硬盘
 */

class HighConfigBuider (var mComputer:Computer):ComputerConfigBuilder{
    override fun setCpu() {
        mComputer.CPU="i7"
    }

    override fun setMemery() {
        mComputer.memory="16G"
    }

    override fun setHardDisk() {
        mComputer.hardDisk="1T"
    }

    override fun setKeyboard() {
        mComputer.keyboard="机型键盘"
    }

    override fun setMouse() {
        mComputer.mouse="无线鼠标"
    }

    override fun getComputer(): Computer {
        return mComputer
    }
}