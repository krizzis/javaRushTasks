package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое 1 2 2 4 5 -1:
4 3 2 1 -1:*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true){
            int x = sc.nextInt();
            if (x==-1) break;
            sum+=x;
            count++;
        }
        System.out.println((double)sum/count);
    }
}

