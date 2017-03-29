package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("child1",true,10, new ArrayList<Human>());
        Human child2 = new Human("child2",true,9, new ArrayList<Human>());
        Human child3 = new Human("child3",true,8, new ArrayList<Human>());

        ArrayList<Human> childs = new ArrayList<>();
        childs.add(child1);
        childs.add(child2);
        childs.add(child3);

        Human dad = new Human("dad", true, 35, childs);
        Human mom = new Human("mom", false, 32, childs);

        ArrayList<Human> dadChild = new ArrayList<>();
        dadChild.add(dad);

        Human grandpaDad = new Human("grandpaDad", true, 60, dadChild);
        Human grandmaDad = new Human("grandmaDad", false, 58, dadChild);

        ArrayList<Human> momChild = new ArrayList<>();
        momChild.add(mom);

        Human grandpaMom = new Human("grandpaMom", true, 60, momChild);
        Human grandmaMom = new Human("grandmaMom", false, 58, momChild);


        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(dad);
        System.out.println(mom);
        System.out.println(grandpaDad);
        System.out.println(grandmaDad);
        System.out.println(grandpaMom);
        System.out.println(grandmaMom);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
