package com.niliv;

public class DuckProductor implements Runnable {

    RoastDuck rd;

    public DuckProductor(RoastDuck rd) {
        this.rd = rd;
    }

    @Override
    public void run() {
        while (true){
            rd.produce("烤鸭");
        }
    }
}
