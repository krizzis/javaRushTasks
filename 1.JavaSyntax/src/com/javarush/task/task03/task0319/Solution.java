package com.javarush.task.task03.task0319;

/*
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        int salary = Integer.parseInt(reader.readLine());
        int years = Integer.parseInt(reader.readLine());


        System.out.println(name + " получает " + salary + " через " + years + " лет.");

    }
}
