package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой

1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года — нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws Exception{

        DateFormat format = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(format.parse(date));

        int dayOfYear = calendar.get(calendar.DAY_OF_YEAR);

        return (dayOfYear%2==0)?false:true;
    }
}


