package com.yls.chains;

/**
 * 职责链模式
 * 将请求与处理分离，适用于 有多个对象可以处理同一个请求时
 */
public class Client {
    public static void main(String[] args) {

        Request request=new Request(6000);

        Approver school=new School("校长");
        Approver college=new College("院长");

        //形成环形链
        school.setNext(college).setNext(school);
        college.handle(request);

    }
}
