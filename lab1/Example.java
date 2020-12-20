package ru.mirea.gibo03.lab1;

public class Example {

    public static void main(String[] args) {

        System.out.println("Hello java!\n");
        Circle c1 = new Circle(10,"red");
        System.out.println(c1);

        c1.setRadius(100);
        c1.setColor("green");
        System.out.println(c1);

        System.out.println(c1.getArea());


    }

}