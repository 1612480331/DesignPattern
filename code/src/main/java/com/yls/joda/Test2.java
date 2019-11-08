package com.yls.joda;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(new DateTime(new Date()));

        System.out.println(Test2.convertDate2LocalByDateFormat(new Date(),"yyyy-MM-dd HH:mm:ss"));

        System.out.println(Test2.convertDate2UTF(new Date()));
        System.out.println(new Date());
        System.out.println(Test2.convertUTC2Date("2019-11-7T14:31:54z"));
    }

    //标准UTC时间，2019-11-7T14:31:54.876z
    public static Date convertUTC2Date(String utcDate){
        DateTime dateTime=DateTime.parse(utcDate
                //"yyyy-MM-dd'T'HH:mm:ssZ" z要大写
        , DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZ"));
        return dateTime.toDate();
    }

    public static String convertDate2UTF(Date javaDate){
        DateTime dateTime=new DateTime(javaDate, DateTimeZone.UTC);
        return dateTime.toString();
    }

    public static String convertDate2LocalByDateFormat(Date javaDate,
                                                       String dateFormat){
        DateTime dateTime=new DateTime(javaDate);
        return dateTime.toString(dateFormat);
    }

}
