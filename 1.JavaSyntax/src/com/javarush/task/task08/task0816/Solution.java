package com.javarush.task.task08.task0816;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws Exception{

        DateFormat format = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);

        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", format.parse("JUNE 1 1980"));
        map.put("Stallone1", format.parse("JULY 1 1980"));
        map.put("Stallone2", format.parse("MARCH 1 1980"));
        map.put("Stallone3", format.parse("NOVEMBER 1 1980"));
        map.put("Stallone4", format.parse("DECEMBER 1 1980"));
        map.put("Stallone5", format.parse("APRIL 1 1980"));
        map.put("Stallone6", format.parse("JUNE 1 1980"));
        map.put("Stallone7", format.parse("JUNE 1 1980"));
        map.put("Stallone8", format.parse("JUNE 1 1980"));
        map.put("Stallone9", format.parse("JUNE 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Date> entry = (Map.Entry<String,Date>)iterator.next();
            Calendar cal = Calendar.getInstance();
            cal.setTime(entry.getValue());
            if(cal.get(Calendar.MONTH)>=5&&cal.get(Calendar.MONTH)<=7){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) throws Exception{
        /*HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);

        map.forEach((k,v)-> System.out.println(k+ ": "+ v));*/
    }
}
