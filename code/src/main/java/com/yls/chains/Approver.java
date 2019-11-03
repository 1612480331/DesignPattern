package com.yls.chains;

public abstract class Approver {

    public Approver(String name) {
        this.name = name;
    }

     String name;
    protected Approver next;

    protected Approver setNext(Approver approver) {
        this.next = approver;
        return approver;
    }

    public abstract void handle(Request request);
}
