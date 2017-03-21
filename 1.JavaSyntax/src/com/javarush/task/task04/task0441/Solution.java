package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader xa = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(xa.readLine());
        int b = Integer.parseInt(xa.readLine());
        int c = Integer.parseInt(xa.readLine());

        int sm = a+b+c;

        int mn= Math.min(a,b);
        int mn1 = Math.min (mn,c);

        int mx = Math.max(a,b);
        int mx1 = Math.max(mx,c);

        System.out.println(sm-mn1-mx1);
    }
}
