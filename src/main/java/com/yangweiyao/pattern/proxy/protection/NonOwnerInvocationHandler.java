package com.yangweiyao.pattern.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-26 08:24
 * @Description 保护代理
 **/
public class NonOwnerInvocationHandler implements InvocationHandler {

    private final PersonBean personBean;

    public NonOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("set") && !method.getName().equals("setHotOrNotRating")) {
            // 其他用户不能改别人的用户信息
            throw new IllegalAccessException();
        }
        return method.invoke(personBean, args);
    }
}
