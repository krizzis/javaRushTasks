package com.javarush.task.task08.task0813;

/**
 * Created by VBeliaev on 28.03.2017.
 */

class Cat1 {
    String name = "Vasya";

    Cat1() {

    }
}
class Cat2 {
    String name = "Vasya";

    Cat2() {
    }

    @Override
    public String toString() {
        return name;
    }
}

public class test {

    public static void main(String[] args) {

        Cat1 cat1 = new Cat1();
        Cat2 cat2 = new Cat2();

        System.out.println(cat1);
        System.out.println(cat2);

    }

}
