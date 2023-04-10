package com.yangweiyao.pattern.factory.common;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-14 08:35
 * @Description
 **/
public enum RelishEnum {

    CHEESE("奶酪味"),

    PEPPERONI("意大利味")
    ;

    private final String mgs;

    RelishEnum(String msg) {
        this.mgs = msg;
    }

    public String getMgs() {
        return mgs;
    }
}
