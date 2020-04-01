package ru.job4j.condition;

public class Point {
    public static double distance(double x1, double y1, double x2, double y2) {
        double a = x2 - x1;
        double b = y2 - y1;
        double a1 = Math.pow(a, 2);
        double b1 = Math.pow(b, 2);
        double c = a1 + b1;
        double rsl = Math.sqrt(c);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 2);
        System.out.println("result (0, 0) to (2, 0)" + result);


    }



}


