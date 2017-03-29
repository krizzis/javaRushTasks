package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        if (s != null) {
            String s1 = new String();
            if (Character.isAlphabetic(s.charAt(0)))
                s1 += Character.toUpperCase(s.charAt(0));
            else s1 +=s.charAt(0);
            for (int i = 1; i < s.length(); i++) {
                char character = s.charAt(i);
                char beforeChar = s.charAt(i - 1);

                if (Character.isLetter(character) && !Character.isLetter(beforeChar)) {
                    character = Character.toUpperCase(character);
                    s1 += character;

                } else
                    s1 += character;

            }
            s = s1;
            System.out.println(s);
        }
    }
}
