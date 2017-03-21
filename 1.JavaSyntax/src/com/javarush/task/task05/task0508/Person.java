package com.javarush.task.task05.task0508;

/* 
Геттеры и сеттеры для класса Person
*/

public class Person {
    String name;
    int age;
    char sex;

    public void setName(String s){this.name=s;}
    public void setAge(int i){this.age=i;}
    public void setSex(char c){this.sex=c;}

    public String getName(){return this.name;}
    public int getAge(){return this.age;}
    public char getSex(){return this.sex;}

    public static void main(String[] args) {

    }
}
