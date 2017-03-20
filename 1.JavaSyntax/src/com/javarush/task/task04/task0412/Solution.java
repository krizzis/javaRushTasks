package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int enteredNumber = Integer.parseInt(reader.readLine());

        if (enteredNumber>0){
            enteredNumber*=2;
        }
        else if (enteredNumber<0) {
            enteredNumber++;
        }
        System.out.println(enteredNumber);
        }

    }

