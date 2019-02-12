package com.niliv;

public class Output implements Runnable{
    Resource r;
    Output(Resource r){
        this.r = r;
    }

    @Override
    public void run() {
        while(true){
            r.out();
        }
    }
}
