package com.example.lianyungang.common;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeUtil {

    public static final String STANDARD_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static Date strToDate(String dateTimeStr,String formatStr){
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(formatStr);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    public static String dateToStr(Date date,String formatStr){
        if(date == null){
            return "";
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(formatStr);
    }

    public static Date strToDate(String dateTimeStr){
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(STANDARD_FORMAT);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    public static String dateToStr(Date date){
        if(date == null){
            return "";
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(STANDARD_FORMAT);
    }

    public static String dateTransform(String s) throws Exception {
        switch (s){
            case "一月":
                s = "01";
                break;
            case "二月":
                s = "02";
            break;
            case "三月":
                s = "03";
            break;
            case "四月":
                s = "04";
            break;
            case "五月":
                s = "05";
            break;
            case "六月":
                s = "06";
            break;
            case "七月":
                s = "07";
            break;
            case "八月":
                s = "07";
            break;
            case "九月":
                s = "09";
            break;
            case "十月":
                s = "10";
            break;
            case "十一月":
                s = "11";
            break;
            case "十二月":
                s = "12";
            break;
            default:
                throw new Exception("日期非法");
        }

        return s;
    }
    public static void main(String[] args) {
        System.out.println(DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
        System.out.println(DateTimeUtil.strToDate("2010-01-01 11:11:11","yyyy-MM-dd HH:mm:ss"));
    }
}
