package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив

1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i<10; i++){
            arr[i]=sc.nextInt();
        }

        int[] tempArr = new int[10];

        for (int i=0; i<10;i++){
            tempArr[9-i]=arr[i];
        }

        for (int i = 0; i<10; i++){
            arr[i] = tempArr[i];
            System.out.println(arr[i]);
        }
    }
}

