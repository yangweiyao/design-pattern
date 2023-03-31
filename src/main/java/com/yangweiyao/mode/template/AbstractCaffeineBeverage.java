package com.yangweiyao.mode.template;

import java.util.Scanner;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-30 08:18
 * @Description 模板方法模式
 * <p>
 *     prepareRecipe()（模板方法）封装好整个制作过程
 *     addCondiments()、brew()这个步骤由子类负责实现
 *     从而确保这个制作过程不变的
 * </p>
 **/
public abstract class AbstractCaffeineBeverage {

    /**
     * 使用final修饰是防止子类破坏这个固定的程序
     */
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if("y".equalsIgnoreCase(getUserInput())) {
            addCondiments();
        }
    }


    private void boilWater() {
        System.out.println("将水烧开");
    }

    private void pourInCup() {
        System.out.println("倒入杯子");
    }

    /**
     * 询问用户是否需要添加调料<br>
     * 当然子类也可以重写这个方法，通过其他途径获取用户答案，由子类自行覆盖，如果没有，则默认使用父类的方法。
     * 与抽象方法对比，作用是可以由子类控制是否要增加/剔除【添加调料】这个步骤
     * @return ‘y’ or ‘n’
     */
    public String getUserInput() {
        enquire();
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    /**
     * 询问语句
     */
    protected abstract void enquire();

    /**
     * 添加适当的调料，比如白砂糖、蜂蜜、柠檬汁等
     */
    protected abstract void addCondiments();

    /**
     * 冲泡对象（茶、咖啡等）
     */
    protected abstract void brew();

}
