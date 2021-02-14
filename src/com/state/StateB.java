package com.state;

public class StateB implements State {
    @Override
    public void request(Context ctx) {
        System.out.print("State is B\n");
    }
}
