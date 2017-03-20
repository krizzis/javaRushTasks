package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    public static ArrayList enterNumbers(int count)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i=0; i<count; i++)
            numbers.add(sc.nextInt());

        return numbers;
    }

    public static ArrayList sortArray (ArrayList nums) {

        Collections.sort(nums);

        return nums;
    }

    public static void printArray(ArrayList nums){
        String text = "";
        for (int i=nums.size()-1; i>=0;i--) {
            //System.out.println(nums.get(i));
            text = text + nums.get(i);
            if (i==0) break;
            text+= " ";
        }
        System.out.println(text);
    }

    public static void main(String[] args) throws Exception {

        ArrayList numbers = enterNumbers(3);
        sortArray(numbers);
        //System.out.println(numbers);
        printArray(numbers);
    }
}
