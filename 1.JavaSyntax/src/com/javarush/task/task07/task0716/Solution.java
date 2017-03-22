package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л

1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {

        ArrayList<String> resList = new ArrayList<>();

        for (int i=0; i<list.size();i++){
            String s = list.get(i);
            if (s.toLowerCase().contains("р") && s.toLowerCase().contains("л")) {
                    resList.add(s);
            }
            else if ((s.toLowerCase().contains("л"))){
                resList.add(s);
                resList.add(s);
            }
            else if (!s.toLowerCase().contains("р")){
                resList.add(s);
            }
        }
        return resList;
    }
}