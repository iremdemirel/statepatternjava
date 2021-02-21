package com.state;

public class StateA extends State {


    public StateA(){

    }

    public State doA(){
        System.out.println("A\n");
        return this;
    }

    public State doB(){
        System.out.println("State is changing from A to B\n");
        return new StateB();
    }

}
