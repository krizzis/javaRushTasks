package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import java.io.IOException;



public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) throws IOException {

        return (number/100 + (number%100)/10 + number%10);
    }
}