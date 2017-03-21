package com.javarush.task.task05.task0510;

/* 
Кошкоинициация


— Имя,
— Имя, вес, возраст
— Имя, возраст (вес стандартный)
— вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
— вес, цвет, адрес (чужой домашний кот)
*/

public class Cat {
    private String name;
    private int age = 1;
    private int weight = 4;
    private String color = "black";
    private String address;


    public void initialize (String name){
        this.name = name;
    }

    public void initialize (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void initialize (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void initialize (int weight, String color){
        this.color = color;
        this.weight = weight;
    }

    public void initialize (int weight, String color, String address){
        this.color = color;
        this.weight = weight;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
