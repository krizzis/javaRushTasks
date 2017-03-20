package com.javarush.task.task03.task0303;

/* 
Реализуй метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызови его дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.

Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/

import javax.xml.bind.SchemaOutputResolver;

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(100, 1.2));
        System.out.println(convertEurToUsd(101, 1.5));
    }

    public static double convertEurToUsd(int eur, double course) {
        return (double)eur*course;
    }
}
