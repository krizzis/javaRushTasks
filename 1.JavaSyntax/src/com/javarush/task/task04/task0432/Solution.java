package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = sc.nextInt();
        int i = 0;

        while (i<count){
            System.out.println(s);
            i++;
        }

    }
}
