package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet();

        final Random random = new Random();

        for (int i=0; i<20; i++){
            set.add(random.nextInt());
        }

        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {

        set.forEach(System.out::println);

        return set;
    }

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set = createSet();
        for (Integer num:set
             ) {
            System.out.println(num);
        }
        removeAllNumbersMoreThan10(set);

        for (Integer num:set
                ) {
            System.out.println(num);
        }
        }


}
