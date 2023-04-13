package com.yangweiyao.pattern.state;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-11 08:02
 * @Description 糖果机
 **/
public class GumballMachine {

    /** 售罄 */
    private final static int SOLD_OUT = 0;
    /** 未投币 */
    private final static int NO_QUARTER = 1;
    /** 已投过币 */
    private final static int HAS_QUARTER = 2;
    /** 发放糖果 */
    private final static int SOLD = 3;

    /** 状态 */
    private int state;
    /** 糖果数量 */
    private int count;


    public GumballMachine(int count) {
        this.count = count;
        if(count > 0) {
            state = NO_QUARTER;
        } else {
            state = SOLD_OUT;
        }
    }

    /**
     * 投币
     */
    public void insertQuarter() {
        switch (state) {
            case HAS_QUARTER:
                System.out.println("你已经投过币了, 无需再投");
                break;
            case NO_QUARTER:
                state = HAS_QUARTER;
                System.out.println("投币成功, 推动杆子就可以得到糖果啦");
                break;
            case SOLD_OUT:
                System.out.println("投币失败：糖果已售罄, 系统自动退币");
                break;
            case SOLD:
                System.out.println("投币失败：系统正在发放糖果, 系统自动退币");
                break;
            default:
                System.out.println("投币异常, 请联系管理员");
        }
    }

    /**
     * 退币
     */
    public void ejectQuarter() {
        switch (state) {
            case HAS_QUARTER:
                System.out.println("退币成功：系统自动退币");
                state = NO_QUARTER;
                break;
            case NO_QUARTER:
            case SOLD_OUT:
                System.out.println("退币失败：未投过币");
                break;
            case SOLD:
                System.out.println("退币失败, 你已经转过杆了");
                break;
            default:
                System.out.println("退币异常, 请联系管理员");
        }
    }

    public void turnCrank() {
        switch (state) {
            case SOLD:
                System.out.println("推动杆子失败：请稍等, 系统正在发放糖果");
                break;
            case NO_QUARTER:
                System.out.println("推动杆子失败：还未投过币");
                break;
            case SOLD_OUT:
                System.out.println("推动杆子失败：糖果已售罄");
                break;
            case HAS_QUARTER:
                System.out.println("推动杆子成功：正在自动发放糖果");
                state = SOLD;
                dispense();
                break;
            default:
                System.out.println("退币异常，请联系管理员");
        }
    }

    /**
     *
     */
    private void dispense() {
        if(state == SOLD) {
            System.out.println("开放闸口, 掉落糖果到底部");
            count--;
            // 更新未投币状态，让下个顾客可以投币
            state = NO_QUARTER;
        }
        if(count <= 0) {
            state = SOLD_OUT;
        }
    }

    public int getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
