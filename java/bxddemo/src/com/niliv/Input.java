package com.niliv;

public class Input implements Runnable{
    Resource r;

    public Input(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        int x=0;
        while(true){
            synchronized (r){
                if(x==0){
                    r.set("yk","male");
                }else{
                    r.set("kk","female");
                }
            }
            x=(x+1)%2;
        }
    }
}
