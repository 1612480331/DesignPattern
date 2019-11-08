package com.yls.jdk8.time;

import sun.reflect.generics.tree.Tree;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = localDateTime.plusDays(4);
        System.out.println(localDateTime1);
        LocalDate localDate = LocalDate.now();
        LocalDate l = localDate.plusDays(5);
        System.out.println(l);
        System.out.println(localDate);

        System.out.println("-------------------");

        LocalDate localDate1 = LocalDate.of(2018, 3, 4);

        System.out.println(localDate1);

        System.out.println("-------------");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);


        LocalDate localDate2 = localDate.plus(2, ChronoUnit.WEEKS);
        System.out.println(localDate2);

        System.out.println("---------------------");

        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.millis());

        Set<String> set=ZoneId.getAvailableZoneIds();
        set.stream().sorted().forEach(System.out::println);

        System.out.println("-----------------------");
        System.out.println(Instant.now());

        LocalDate  l1=LocalDate.now();
        LocalDate l2=LocalDate.of(2018,10,8);
        Period period=Period.between(l2,l1);
        System.out.println(String.format("%s,%s,%s",period.getYears(),period.getMonths(),
                period.getDays()));


    }
}
