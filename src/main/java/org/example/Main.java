package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    private static Set<Cat> catSet;

    public static void addCat(int id, String name, String color, int age) {
        Cat cat = new Cat();
        catSet.add(cat);
    }

    public static void main(String[] args) {
        catSet = new HashSet<>();
        int id = 1;
        addCat(id++, "Barsik", "Black", 3);
        addCat(id++, "Filya", "black-white", 1);
        addCat(id++, "Barsik", "Black", 3);
        addCat(id++, "Barsik", "Black", 4);
        addCat(id++, "Murka", "Black", 4);
        addCat(id++, "Borya", "Black", 2);

        for (Cat cat1 : catSet) {
            System.out.println(cat1);
            for (Cat cat2 : catSet) {
                System.out.println(cat2);
                System.out.println(cat1.equals(cat2));
                System.out.println("----");
            }
            System.out.println("------------------------------------------------------");
        }

        for (Cat cat1 : catSet) {
            System.out.println(cat1.hashCode());
        }
    }
}