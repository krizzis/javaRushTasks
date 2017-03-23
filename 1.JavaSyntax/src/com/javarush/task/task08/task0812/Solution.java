package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 9, 12, 12, 14:
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> spisok = new ArrayList();
        int s = 1;
        int max = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            spisok.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < spisok.size() - 1; i++) {
            if (spisok.get(i + 1) == spisok.get(i)){
                s++;
                if (s > max) max = s;
            }
            else{
                if (s > max) {
                    max = s;
                }
                s = 1;
            }
        }
        System.out.println(max);
    }
}