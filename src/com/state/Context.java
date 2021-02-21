package com.state;

public class Context {

    State currentstate;

    public Context(){

        currentstate = new StateA();

    }

    public void doA(){
        System.out.print("ctx : A-- \n");
        currentstate = currentstate.doA();
    }

    public void doB(){
        System.out.print("ctx : B-- \n");
        currentstate = currentstate.doB();
    }

}
