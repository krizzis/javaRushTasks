package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей

Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: «фамилия» — «зарплата».
Удалить из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> map = new HashMap<>();

        for (int i=0; i<10; i++){
            map.put("secondName"+i,i*100);
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        for(Iterator it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry) it.next();
            if ((int) entry.getValue() < 500) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) {
        /*HashMap<String,Integer> map = createMap();
        removeItemFromMap(map);
        map.forEach((k,v)-> System.out.println(k+": "+v));*/
    }
}