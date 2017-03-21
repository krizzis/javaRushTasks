package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа

Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» — если число отрицательное и четное,
«отрицательное нечетное число» — если число отрицательное и нечетное,
«ноль» — если число равно 0,
«положительное четное число» — если число положительное и четное,
«положительное нечетное число» — если число положительное и нечетное.
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String tag1 = "", tag2 = "";
        int num = sc.nextInt();

        tag1 = (num>0)?"положительное":"отрицательное";
        tag2 = (num%2==0)?"четное":"нечетное";

        if (num!=0)
            System.out.println(tag1+" "+tag2 + " число");
        else
            System.out.println("ноль");

    }
}
