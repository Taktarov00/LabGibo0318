package ru.mirea.gibo03.lab1;

public class Ball {

    private String color;
    private int radius;

    public Ball(String c, int r) {
        color = c;
        radius = r;
    }

    public Ball(String c) {
        color = c;
        radius = 0;
    }

    public Ball() {
        color = "Yellow";
        radius = 20;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(String color) {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public String toString() {
        return this.color + "ball has a radius" + this.radius;
    }

    public void volumeOfBall() {
        System.out.println("Volume of ball with color"+ color + " is " + (4.0/3.0) * Math.PI * radius*radius);
    }

}
