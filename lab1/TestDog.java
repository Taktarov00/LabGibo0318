package ru.mirea.gibo03.lab1;

public class TestDog {
    public static void main(String[] args) {

        Dog d1 = new Dog("Schrek", 2);
        Dog d2 = new Dog("Fiona", 9);
        Dog d3 = new Dog("Body");

        d3.setAge(3);

        System.out.println(d1);

        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
