package com.whw.designpatterswithjava.builder;

public class Computer {

    private String CPU;
    private String memory;
    private String hardDisk;
    private String keyboard;
    private String mouse;

    private Computer(Buidler buidler){
        this.CPU=buidler.CPU;
        this.memory=buidler.memory;
        this.hardDisk=buidler.hardDisk;
        this.keyboard=buidler.keyboard;
        this.mouse=buidler.mouse;
    }

    @Override
    public String toString() {

        return "Computer{" +
                "CPU:" +CPU+
                "memory:" +memory+
                "hardDisk:" +hardDisk+
                "keyboard:" +keyboard+
                "mouse:" +mouse+
                "}";
    }

    public static class Buidler{
        private String CPU;
        private String memory;
        private String hardDisk;
        private String keyboard;
        private String mouse;

        public Buidler CPU(String CPU){
            this.CPU=CPU;
            return this;
        }

        public Buidler memory(String memory){
            this.memory=memory;
            return this;
        }

        public Buidler hardDisk(String hardDisk){
            this.hardDisk=hardDisk;
            return this;
        }

        public Buidler keyboard(String keyboard){
            this.keyboard=keyboard;
            return this;
        }

        public Buidler mouse(String mouse){
            this.mouse=mouse;
            return this;
        }

        public Computer builder(){
            return new Computer(this);
        }
    }

}
