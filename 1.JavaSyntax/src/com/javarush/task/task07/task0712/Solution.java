package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые

1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<10; i++){
            list.add(reader.readLine());
        }

        int minLen = list.get(0).length();
        int maxLen = list.get(0).length();

        for(int i=1; i<list.size(); i++) {
            int len = list.get(i).length();
            if(len>maxLen) maxLen = len;
            if(len<minLen) minLen = len;
        }

        for(int i=0; i<list.size(); i++) {
            int len = list.get(i).length();
            if (len==minLen || len==maxLen) {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
