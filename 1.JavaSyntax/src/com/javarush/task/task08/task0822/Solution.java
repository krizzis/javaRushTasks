package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* 
Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список — метод getIntegerList.
3. Найти минимальное число среди элементов списка — метод getMinimum.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = array.get(0);
        for (int i=1; i<array.size();i++){
            int x = array.get(i);
            if (x<min) min=x;
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i=0; i<n; i++){
            list.add(scanner.nextInt());
        }
        return list;
    }
}
