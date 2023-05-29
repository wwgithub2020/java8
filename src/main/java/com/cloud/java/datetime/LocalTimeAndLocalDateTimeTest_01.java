package com.cloud.java.datetime;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @CreateTime: 2023-05-20  16:26
 * @Description: java8时间 API
 * @Version: 1.0
 */
public class LocalTimeAndLocalDateTimeTest_01 {

    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println("" + l);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("是：" + now);

        //  获取年
        System.out.println(now.getYear());
        //  获取月
        System.out.println(now.getMonthValue());
        //  获取日
        System.out.println(now.getDayOfMonth());
        //  获取小时
        System.out.println(now.getHour());
        //  获取分钟
        System.out.println(now.getMinute());
        //  获取秒
        System.out.println(now.getSecond());
    }

    @Test
    public void test_01() {
        String time = localDateTimeToString(LocalDateTime.now(), "yyyy-MM-dd HH:mm:ss");
        System.out.println("测试结果是：" + time);
    }

    @Test
    public void test_02() {
        LocalDateTime dateTime = timestampToLocalDateTime(1684572548265L);
        System.out.println("测试结果是：" + dateTime);
    }

    @Test
    public void test_03() {
        LocalDateTime localDateTime = dateToLocalDateTime(new Date());
        System.out.println("测试结果是：" + localDateTime);
        System.out.println("结果是：" + new Date());
    }

    /**
     * 将LocalDateTime 转为自定义的时间格式字符串
     * @param localDateTime
     * @param format
     * @return
     */
    public static String localDateTimeToString(LocalDateTime localDateTime, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return localDateTime.format(formatter);
    }

    /**
     * 将long类型的timeStamp转为LocalDateTime
     * @param timestamp
     * @return
     */
    public static LocalDateTime timestampToLocalDateTime(long timestamp) {
        Instant instant = Instant.ofEpochMilli(timestamp);
        ZoneId zone = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant, zone);
    }

    /**
     * 将LocalDateTime转为long类型的timeStamp
     * @param localDateTime
     * @return
     */
    public static long localDateTimeToTimestamp(LocalDateTime localDateTime) {
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        return instant.toEpochMilli();
    }

    /**
     * 将LocalDateTime to Date
     * @param localDateTime
     * @return
     */
    public static Date localDateTimeToDate(LocalDateTime localDateTime) {
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        return Date.from(instant);
    }

    /**
     * 将Date 转为 LocalDate
     * @param date
     * @return
     */
    public static LocalDate dateToLocalDate(Date date) {
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        return localDateTime.toLocalDate();
    }

    /**
     * LocalTime to Date
     * @param localTime
     * @param localDate
     * @return
     */
    public static Date localTimeToDate(LocalTime localTime , LocalDate localDate) {
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        return Date.from(instant);
    }

    /**
     * Date to LocalDateTime
     * @param date
     * @return
     */
    public static LocalDateTime dateToLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}
