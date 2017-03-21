package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
— Имя,
— Имя, вес, возраст
— Имя, возраст (вес стандартный)
— вес, цвет, (имя, адрес и возраст – неизвестные. Кот — бездомный)
— вес, цвет, адрес (чужой домашний кот)
*/

public class Cat {
    private String name;
    private int age = 1;
    private int weight = 4;
    private String color = "black";
    private String address;


    public Cat (String name){
        this.name = name;
    }

    public Cat (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat (String name, int age){
        this.name = name;
        this.age = age;
    }

    public Cat (int weight, String color){
        this.color = color;
        this.weight = weight;
    }

    public Cat (int weight, String color, String address){
        this.color = color;
        this.weight = weight;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
