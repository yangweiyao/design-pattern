package com.yangweiyao.mode.adapter.test;

import com.yangweiyao.mode.adapter.Duck;
import com.yangweiyao.mode.adapter.Turkey;
import com.yangweiyao.mode.adapter.animal.MallardDuck;
import com.yangweiyao.mode.adapter.animal.WildTurkey;
import com.yangweiyao.mode.adapter.support.TurkeyAdapter;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-28 08:19
 * @Description
 **/
public class DuckTestDrive {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        Turkey wildTurkey = new WildTurkey();
        // 通过适配器伪装成鸭子类型
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("========= 火鸡 =========");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\n========= 鸭子 =========");
        testDuck(mallardDuck);

        System.out.println("\n========= 适配器伪装的鸭子 =========");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
