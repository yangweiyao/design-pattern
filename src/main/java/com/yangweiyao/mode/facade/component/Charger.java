package com.yangweiyao.mode.facade.component;

/**
 * @Author yangweiyao
 * @CreateTime 2023-03-29 08:13
 * @Description 充电器电源
 **/
public class Charger {

    public void electrify() {
        System.out.println("开始通电, 变压电流输入给主板");
    }

    /**
     * 这里不用close是因为电脑断电实际上还是有电流传输的<br>
     * 真正的（物理）断电是人为手工拔掉电源
     */
    public void interrupt() {
        System.out.println("安全正常断电");
    }

}
