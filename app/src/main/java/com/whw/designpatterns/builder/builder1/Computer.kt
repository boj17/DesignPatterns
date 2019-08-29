package com.whw.designpatterns.builder.builder1

/**
 * 1 要建造的产品Product -- 组装的电脑
 */
data class Computer(
    var CPU:String,
    var memory:String,
    var hardDisk:String,
    var keyboard:String,
    var mouse:String){

    override fun toString(): String {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", memory='" + memory + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                '}'
    }
}