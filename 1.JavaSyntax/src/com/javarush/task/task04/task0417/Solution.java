package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c) System.out.println(a + " " + b + " " + c);
        if ((a == b) && (a != c)) System.out.println(a + " " + b);
        if ((b == c) && (b != a)) System.out.println(b + " " + c);
        if ((a == c) && (a != b)) System.out.println(a + " " + c);
    }
}