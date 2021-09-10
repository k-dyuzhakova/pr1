package homework;

import java.lang.*;
public class Ball {
    private double radius;
    private String color;

    public Ball(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

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

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
    public void examination () {
        System.out.println("Радиус мяча равен " +radius);
        System.out.println("Цвет мяча " +color);
    }
}
