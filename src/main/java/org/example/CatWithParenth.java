package org.example;

public class CatWithParenth {

    private int idMother;
    private int idFather;

    Cat cat1 = new Cat();
    Cat cat2;

    public CatWithParenth(int idMother, int idFather) {
        this.idFather = idFather;
        this.idMother = idMother;
        cat2 = new Cat();
        cat2.setIdMother(this.idMother, this.idFather);
    }
}
