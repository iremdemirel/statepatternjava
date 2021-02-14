package com.state;

public class StateA implements State {
    @Override
    public void request(Context ctx) {
        System.out.print("State is A\n");
    }
}
