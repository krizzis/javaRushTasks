package com.javarush.task.task06.task0601;

/* 
Метод finalize класса Cat
*/

public class Cat {
    protected void finalize() throws Throwable{
        System.out.println("Boom");
    }
    public static void main(String[] args) {

    }
}
