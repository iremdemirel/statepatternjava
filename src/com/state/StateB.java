package com.state;

public class StateB extends State {


    public State doB(){
        System.out.println("B\n");
        return this;
    }

    public State doA(){
        System.out.print("State is changing B to A\n");
        return new StateB();
    }
}
