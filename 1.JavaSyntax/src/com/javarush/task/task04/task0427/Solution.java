package com.javarush.task.task04.task0427;

/* 
Описываем числа
Ввести с клавиатуры целое число в диапазоне 1 — 999. Вывести его строку-описание следующего вида:
«четное однозначное число» — если число четное и имеет одну цифру,
«нечетное однозначное число» — если число нечетное и имеет одну цифру,
«четное двузначное число» — если число четное и имеет две цифры,
«нечетное двузначное число» — если число нечетное и имеет две цифры,
«четное трехзначное число» — если число четное и имеет три цифры,
«нечетное трехзначное число» — если число нечетное и имеет три цифры.

Если введенное число не попадает в диапазон 1 — 999, в таком случае ничего не выводить на экран.
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
/*        Scanner sc = new Scanner(System.in);

        String tag1, tag2;
        int num = sc.nextInt();

        tag1 = (num%2==0)?"четное":"нечетное";
        tag2 = (num<10)?"однозначное":(num<100)?"двухзначное":"трехзначное";

        if (num>=1 && num <=999)
            System.out.println(tag1+" "+tag2 + " число");
        else
            return;
    }*/

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String data = r.readLine();
        int a = Integer.parseInt(data);
        String s1, s2 = "0";

        if ((a < 1) || (a > 999)) return;
        else {
            if (a % 2 == 0) s1 = "четное";
            else s1 = "нечетное";
            if (data.length() == 1) s2 = "однозначное";
            if (data.length() == 2) s2 = "двузначное";
            if (data.length() == 3) s2 = "трехзначное";
            System.out.println(s1 + " " + s2 + " число");
        }
    }
}
