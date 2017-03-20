package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int enteredNumber = Integer.parseInt(r.readLine());
        String response;

        switch (enteredNumber){
            case 1:
                response = "понедельник";
                break;
            case 2:
                response = "вторник";
                break;
            case 3:
                response = "среда";
                break;
            case 4:
                response = "четверг";
                break;
            case 5:
                response = "пятница";
                break;
            case 6:
                response = "суббота";
                break;
            case 7:
                response = "воскресенье";
                break;
            default:
                response = "такого дня недели не существует";
                break;
        }

        System.out.println(response);
    }
}