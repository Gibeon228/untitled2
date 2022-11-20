package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    private static Set<Cat> catSet;

    public static void addCat(int id, String name, String color, int age) {
        Cat cat = new Cat(id, name, color, age);
        catSet.add(cat);
    }

    public static void main(String[] args) {
        catSet = new HashSet<>();
        addCat(1, "Barsik", "Black", 3);
        addCat(2, "Filya", "black-white", 1);
        addCat(1, "Barsik", "Black", 3);
        addCat(1, "Barsik", "Black", 4);

        for (Cat cat1 : catSet) {
            System.out.println(cat1);
            for (Cat cat2 : catSet) {
                System.out.println(cat2);
                System.out.println(cat1.equals(cat2));
                System.out.println("----");
            }
            System.out.println("------------------------------------------------------");
        }

//        for (Cat cat1 : catSet) {
//            System.out.println(cat1.hashCode());
//        }
    }
}