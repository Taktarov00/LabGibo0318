package ru.mirea.lab2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(200, 200);
        System.out.println(b1);
        b1.move(40, 25);
        System.out.println(b1);
    }
}
