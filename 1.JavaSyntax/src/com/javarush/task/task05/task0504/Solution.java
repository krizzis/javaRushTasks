package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat vaska = new Cat("Vaska",1,10,10);
        Cat ragnar = new Cat("Ragnar",2,5,5);
        Cat kisya = new Cat("Kisya",3,2,2);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}