package com.yls.joda;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

public class Test1 {
    public static void main(String[] args) {
        DateTime dt1=new DateTime();
        DateTime dt2=dt1.plusDays(2);
        System.out.println(dt1);
        System.out.println(dt1.toString("yyyy-MM-dd"));
        System.out.println(dt2.toString("yyyy-MM-dd"));
        System.out.println("--------------------");
        DateTime dt3=dt1.withDayOfMonth(2);
        System.out.println(dt3.toString("yyyy-MM-dd"));

        LocalDate localDate=new LocalDate();
        System.out.println(localDate);
        LocalDateTime localDateTime=new LocalDateTime();
        System.out.println(localDateTime);
        System.out.println("---------------");

        localDate=localDate.plusMonths(2)
                .dayOfMonth().withMinimumValue();
        System.out.println(localDate);


        DateTime dateTime=new DateTime();
        DateTime dateTime1=dateTime.minusYears(2)
                .withMonthOfYear(3).dayOfMonth()
                .withMaximumValue();
        System.out.println(dateTime1.toString("yyyy-MM-dd"));


    }
}
