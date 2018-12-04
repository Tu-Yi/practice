package com.company;

public class Wife {

    /**
     * 妻子的私有属性
     */
    private Mann man;


    /**
     * 私有属性对外开放的接口，女人一般不会开放年龄接口
     */
    public Mann getMan() {
        return man;
    }

    public void setMan(Mann man) {
        this.man = man;
    }
}
