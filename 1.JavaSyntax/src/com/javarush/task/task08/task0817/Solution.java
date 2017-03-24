package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» — «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> map = new HashMap<>();

        for (int i=0; i<10; i++){
            map.put("secondName"+i,"firstName"+i);
        }
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        Iterator i1 = map.entrySet().iterator();
        while (i1.hasNext()){
            Map.Entry entry1 = (Map.Entry)i1.next();
            Iterator i2 = map.entrySet().iterator();

            while (i2.hasNext()){
                Map.Entry entry2 = (Map.Entry)i2.next();

                String k1 = (String) entry1.getKey();
                String v1 = (String) entry1.getValue();
                String k2 = (String) entry2.getKey();
                String v2 = (String) entry2.getValue();

                if(v1.equals(v2) && !k1.equals(k2)){
                    removeItemFromMapByValue(map,v1);
                    i1 = map.entrySet().iterator();
                    break;
                }
            }

        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
