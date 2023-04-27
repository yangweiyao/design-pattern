package com.yangweiyao.pattern.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-26 08:18
 * @Description 保护代理
 **/
public class OwnerInvocationHandler implements InvocationHandler {

    private final PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("setHotOrNotRating")) {
            // 用户不能改自己HotOrNot评分
            throw new IllegalAccessException();
        }
        return method.invoke(personBean, args);
    }
}
