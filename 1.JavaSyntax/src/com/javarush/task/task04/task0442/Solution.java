package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (1==1){
            int x = sc.nextInt();
            sum+=x;
            if (x==-1) break;
        }
        System.out.println(sum);


    }
}
