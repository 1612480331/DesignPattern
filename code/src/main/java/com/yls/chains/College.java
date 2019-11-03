package com.yls.chains;

public class College extends Approver {
    public College(String name) {
        super(name);
    }

    @Override
    public void handle(Request request) {
        if(request.getPrice()>2000&&request.getPrice()<5000){
            System.out.println(this.name+"处理");
        }else{
            next.handle(request);
        }
    }
}
