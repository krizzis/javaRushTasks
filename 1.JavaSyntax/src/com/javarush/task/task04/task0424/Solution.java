package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a !=b && a!=c && b!=c){}
        else if (a!=b && a!=c) System.out.println(1);
        else if (a!=b && b!=c) System.out.println(2);
        else if (c!=b && a!=c) System.out.println(3);
    }
}
