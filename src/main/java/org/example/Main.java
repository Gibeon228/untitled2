package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    private static Set<Cat> catSet;

    public static void addCat(int id, String name, String color, int age, int idMother, int idFather) {
        Cat cat = new Cat(id, name, color, age, idMother, idFather);
        catSet.add(cat);
    }

    public static void main(String[] args) {
        catSet = new HashSet<>();
        addCat(1, "Barsik", "Black", 3, 3, 2);
        addCat(2, "Filya", "black-white", 1, 4, 7);
        addCat(1, "Barsik", "Black", 3, 3, 2);
        addCat(1, "Barsik", "Black", 4,3, 2 );
        addCat(3, "Murka", "Black", 4,9, 11 );

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