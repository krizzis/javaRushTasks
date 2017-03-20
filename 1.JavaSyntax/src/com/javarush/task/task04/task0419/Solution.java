package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        //int[] nums = new int[4];
        int max = sc.nextInt();;

        for (int i=1; i<4; i++){
            int enteredNum = sc.nextInt();
            if (enteredNum>max) max=enteredNum;
        }

        System.out.println(max);
    }
}
