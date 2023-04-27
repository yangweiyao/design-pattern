package com.yangweiyao.pattern.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-11 08:02
 * @Description 糖果机 新需求：10个人里有1个人免费得到糖果（即：赢家最后可以得到两颗糖果）
 **/
public class GumballMachine
        extends UnicastRemoteObject implements GumballMachineRemote {

    private String location;

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    /** 状态 */
    private State state;
    /** 糖果数量 */
    private int count;

    public GumballMachine(int numberGumballs) throws RemoteException {
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
        if(numberGumballs > 0) {
            state = noQuarterState;
            count = numberGumballs;
        } else {
            state = soldOutState;
        }
    }

    public GumballMachine(int numberGumballs, String location) throws RemoteException {
        this(numberGumballs);
        this.location = location;
    }

    /**
     * 投币
     */
    public void insertQuarter() {
        state.insertQuarter();
    }

    /**
     * 退币
     */
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("开放闸口, 掉落糖果到底部");
        if(count > 0) {
            count--;
        }
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getLocation() {
        return location;
    }
}
