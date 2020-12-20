package ru.mirea.gibo03.lab1;

public class Circle {

    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 2.0;
        color = "black";
    }

    @Override
    public String toString() {
        return "ru.mirea.gibo03.lab1.Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double getArea(){

        double c;
        c = radius*radius*Math.PI;
        return c;

    }
}
