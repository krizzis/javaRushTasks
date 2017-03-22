package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массивный максимум

1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        for (int i=0; i<arr.length;i++) arr[i]= sc.nextInt();
        return arr;
    }

    public static int max(int[] array) {
            int max = array[0];
            for(int i=1; i<array.length;i++) max=(array[i]>max)?array[i]:max;
        return max;
    }
}
