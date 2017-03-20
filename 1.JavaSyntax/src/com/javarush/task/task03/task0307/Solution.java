package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {

        int zergsNumber = 10;
        Zerg[] zergs = new Zerg[zergsNumber];

        for (int i = 0; i<zergs.length; i++){
            zergs[i] = new Zerg();
            zergs[i].name = "Zerg"+i;
        }


        int terranNumber = 12;
        Terran[] terrans = new Terran[terranNumber];

        for (int i = 0; i<terrans.length; i++){
            terrans[i] = new Terran();
            terrans[i].name = "Terran"+i;
        }

        int protosNumber = 5;
        Protoss[] protosses = new Protoss[protosNumber];

        for (int i = 0; i<protosses.length; i++){
            protosses[i] = new Protoss();
            protosses[i].name = "Protoss"+i;
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
