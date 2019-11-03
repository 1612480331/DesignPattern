package com.yls.chains;

public class School extends Approver{

    public School(String name) {
        super(name);
    }

    @Override
    public void handle(Request request) {
        if(request.getPrice()>5000){
            System.out.println(this.name+"处理");
        }else{
            next.handle(request);
        }
    }
}
