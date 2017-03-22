package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов

1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

/*public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[10];
        int[] nums = new int[10];

        for (int i=0; i<str.length;i++){str[i] = sc.next();}
        for (int i=0; i<nums.length;i++){nums[i]=str[i].length();}
        for (int i=0; i<nums.length;i++) {System.out.println(nums[i]);}

    }
}*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        int[] list2 = new int[10];


        for (int i = 0; i < 10; i++) {
            list[i] = reader.readLine();
        }


        for (int j = 0; j < 10; j++) {
            list2[j] = list[j].length();
        }


        for (int z = 0; z < 10; z++) {
            System.out.println(list2[z]);
        }
    }
}
