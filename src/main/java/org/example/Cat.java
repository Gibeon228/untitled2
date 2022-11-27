package org.example;

public class Cat {
    private int id;
    private String name;
    private String color;
    private int age;
    private int idMother;
    private int idFather;

    private int idChildren;
    //private ArrayList<String> children;
    public Cat() {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.idMother = 0;
        this.idFather = 0;
        this.idChildren = 0;
    }

    public Cat(int id, String name, String color, int age, int idMother, int idFather) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.idMother = idMother;
        this.idFather = idFather;
        this.idChildren = 0;
    }

    public Cat(int id, String name, String color, int age, int idMother, int idFather, int idChildren) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.idMother = idMother;
        this.idFather = idFather;
        //this.children = new ArrayList<>();
        this.idChildren = idChildren;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIdMother(int idMother, int idFather) {this.idMother = idMother;}

    @Override
    public String toString() {

        return "имя кота: " + this.name + "\nокрас кота: " + this.color + "\nколичество полных лет: " + this.age + "\n" + "Мать: " + this.idMother + "\n" + "Отец: " + this.idFather + "\n" + idChildren + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cat)) return false;

        Cat cat = (Cat) obj;
        if (this.id != cat.id) return false; //в дз написано все поля равны, поэтому id я делал тоже равным,
        // если всё же все поля имеются в виду без айди то по сути здесь
        // нужно убрать восклицательный знак и изменить дальше (или закоммитить строку с if (this.id...
        // и раскомитить следуюущую строку и см. далее*/
        // if (this.id == cat.id) return false;
        if (this.name != cat.name) return false;
        if (this.color != cat.color) return false;
        if (this.age != cat.age) return false;
        //return true; //эту строку раскомитить, если id разные, а дубликаты имеется в виду, что все
        //остальные поля равны, следующую строку в этом случае можно коммитить, а можно оставить
        return !(super.equals(obj)); //если все поля одиннаковые, включая id, то нам нужно для удаления дубликатов
        // чтобы данное условие было ложным.
    }

    @Override
    public int hashCode() {
        return id;
    }
}