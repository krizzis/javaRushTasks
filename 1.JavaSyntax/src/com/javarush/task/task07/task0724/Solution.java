package com.javarush.task.task07.task0724;

/* 
Семейная перепись

Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
*/

import java.security.PrivateKey;

public class Solution {
    public static void main(String[] args) {
        Human ded1 = new Human ("Иван", true, 60);
        Human ded2 = new Human ("Игорь", true, 65);
        Human bab1 = new Human ("Нина", false, 55);
        Human bab2 = new Human ("Вера", false, 50);
        Human otc = new Human ("Петр", true, 40, ded1, bab1);
        Human mam = new Human ("Таня", false, 38, ded2, bab2);
        Human det1 = new Human ("Ира", false, 14, otc, mam);
        Human det2 = new Human ("Яна", false, 10, otc, mam);
        Human det3 = new Human ("Коля", true, 5, otc, mam);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(otc);
        System.out.println(mam);
        System.out.println(det1);
        System.out.println(det2);
        System.out.println(det3);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















