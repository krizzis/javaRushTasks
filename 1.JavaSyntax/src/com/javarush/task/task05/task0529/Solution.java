package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово «сумма».
Вывести на экран полученную сумму.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while(true){
            String s = sc.next();
            if(s.equals("сумма")) break;
            int x = Integer.parseInt(s);
            sum+=x;
        }
        System.out.println(sum);
    }
}
