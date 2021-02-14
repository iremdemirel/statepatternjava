package com.state;

public class Context {
    State currentState;

    public Context(){
        this.currentState = new StateA();
    }

    public void valueChange(int val){
        if(val <=0){
            this.currentState = new StateA();
        }
        else
            this.currentState = new StateB();

        currentState.request(this);
    }
}
