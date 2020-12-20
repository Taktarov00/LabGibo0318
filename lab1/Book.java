package ru.mirea.gibo03.lab1;

public class Book {

    private String color;
    private int pages;

    public Book(String c, int p) {
        color = c;
        pages = p;
    }

    public Book(String c) {
        color = c;
        pages = 0;
    }

    public Book() {
        color = "Yellow";
        pages = 80;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(String color) {
        return color;
    }

    public int getPages() {
        return pages;
    }

    public String toString() {
        return this.color + "book has" + this.pages + "pages";
    }

    public void numberOfCharacters() {
        System.out.println("Book with color" + color + "has" + (pages/80)*40 + "lines");
    }

}
