package ru.mirea.gibo03.lab1;

public class TestBook {
    public static void main(String[] args) {

        Book b1 = new Book("White", 90);
        Book b2 = new Book("Blue", 150);
        Book b3 = new Book("Red");

        b3.setPages(80);

        System.out.println(b1);

        b1.numberOfCharacters();
        b2.numberOfCharacters();
        b3.numberOfCharacters();
    }

}
