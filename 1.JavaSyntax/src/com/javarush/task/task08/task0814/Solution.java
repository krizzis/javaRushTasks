package com.javarush.task.task08.task0814;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet createSet() throws IOException {

        HashSet set = new HashSet<>();
        for (int i=0; i<20; i++) set.add(i);
        return set;
    }

    public static HashSet removeAllNumbersMoreThan10(HashSet set) {

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            if ((int)iterator.next() > 10) iterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
