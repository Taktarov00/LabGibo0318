package ru.mirea.gibo03.lab1;

public class TestBall {
    public static void main(String[] args) {

        Ball b1 = new Ball("Yellow", 20);
        Ball b2 = new Ball("Black", 5);
        Ball b3 = new Ball("Purple");

        b3.setRadius(20);

        System.out.println(b1);

        b1.volumeOfBall();
        b2.volumeOfBall();
        b3.volumeOfBall();
    }
}
