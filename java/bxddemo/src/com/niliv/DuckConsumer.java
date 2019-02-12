package com.niliv;

public class DuckConsumer implements Runnable {

    RoastDuck rd;

    public DuckConsumer(RoastDuck rd) {
        this.rd = rd;
    }

    @Override
    public void run() {
        while (true){
            rd.consume();
        }
    }
}
