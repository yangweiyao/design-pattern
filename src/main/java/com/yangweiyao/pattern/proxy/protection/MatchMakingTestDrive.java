package com.yangweiyao.pattern.proxy.protection;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-27 08:10
 * @Description
 **/
public class MatchMakingTestDrive {

    private final static Map<String, PersonBean> map = new HashMap<>(4);

    static {
        PersonBean personBean = new PersonBeanImpl();
        personBean.setName("张三");
        personBean.setGender("男");
        personBean.setInterests("划水");
        personBean.setHotOrNotRating(0);
        map.put("张三", personBean);
    }

    public static void main(String[] args) {
        MatchMakingTestDrive matchMakingTestDrive = new MatchMakingTestDrive();
        matchMakingTestDrive.drive();
    }

    public void drive() {
        PersonBean personBeanByZS = map.get("张三");
        PersonBean ownerProxy = getOwnerProxy(personBeanByZS);
        boolean proxyClass = Proxy.isProxyClass(ownerProxy.getClass());
        System.out.println("是否为代理类：" + proxyClass);
        System.out.println("名字：" + ownerProxy.getName());
        ownerProxy.setInterests("游泳");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println(ownerProxy.getName() + "不能打分");
        }
        System.out.println(ownerProxy);

        PersonBean nonOwnerProxy = getNonOwnerProxy(personBeanByZS);
        System.out.println("名字：" + ownerProxy.getName());
        try {
            nonOwnerProxy.setInterests("游泳");
        } catch (Exception e) {
            System.out.println(nonOwnerProxy.getName() + "不能修改兴趣");
        }
        nonOwnerProxy.setHotOrNotRating(7);
        System.out.println(nonOwnerProxy);
    }

    /**
     * 控制对象不能打分，即调用setHotOrNotRating会报错
     */
    public PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(), new OwnerInvocationHandler(personBean));
    }

    /**
     * 控制对象不能setting，只能getting/setHotOrNotRating
     */
    public PersonBean getNonOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(), new NonOwnerInvocationHandler(personBean));
    }


}
