package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {

        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);

            int num = 3;
            int countPlus = 0;
            int countMinus = 0;

            for(int i=0; i<num; i++)
            {
                int x = sc.nextInt();
                if (x>0) countPlus++;
                else if(x<0) countMinus++;
            }

            System.out.println("количество отрицательных чисел: " + countMinus);
            System.out.println("количество положительных чисел: " + countPlus);
        }

}

