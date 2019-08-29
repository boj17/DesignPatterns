package com.whw.designpatterns.builder.builder1

/**
 * Builder的具体实现ConcreteBuilder -- 对上述抽象步骤的实现，比如装i5CPU、8G内存条、1T硬盘
 * 实现类 低配版
 */
class LowConfigBuilder() :ComputerConfigBuilder {
    var mComputer?=null
    init {
//        var mComputer=Computer()
    }
    override fun setCpu() {
        mComputer.CPU="i5"
    }

    override fun setMemery() {
        mComputer.memory="8G"
    }

    override fun setHardDisk() {
        mComputer.hardDisk="500G"
    }

    override fun setKeyboard() {
        mComputer.keyboard="薄膜键盘"
    }

    override fun setMouse() {
        mComputer.memory="有线鼠标"
    }

    override fun getComputer(): Computer {
     return mComputer
    }
}