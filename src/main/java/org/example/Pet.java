package org.example;

public abstract class Pet {

    protected int id;
    protected String name;
    protected String color;
    protected int age;
    protected int idMother;
    protected int idFather;

    protected Pet(int id, String name, String color, int age, int idMother, int idFather) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.idMother = idMother;
        this.idFather = idFather;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "имя кота: " + this.name + "\nокрас кота: " + this.color + "\nколичество полных лет: " + this.age + "\n" + "Мать: " + this.idMother + "\n" + "Отец: " + this.idFather + "\n";
    }

}
