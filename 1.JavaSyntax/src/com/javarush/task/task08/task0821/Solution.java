package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String,String> map = new HashMap<>();
        map.put("SecondName1","FirstName1");
        map.put("SecondName2","FirstName1");
        map.put("SecondName3","FirstName2");
        map.put("SecondName3","FirstName3");
        map.put("SecondName3","FirstName4");
        map.put("SecondName4","FirstName5");
        map.put("SecondName5","FirstName6");
        map.put("SecondName6","FirstName6");
        map.put("SecondName7","FirstName7");
        map.put("SecondName8","FirstName8");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
