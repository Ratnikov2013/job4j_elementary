package ru.job4j.convert.Calculator.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double a = x2 - x1;
        double a1 = Math.sqrt(a);
        double b = y2 - y1;
        double b1 = Math.sqrt(b);
        double c = a1 + b1;
        double d = Math.pow(c, 2);
        return (d);
    }
    public static void main(String[]args){
        double s = Point.distance(0,0,2,0);
        System.out.println(s);
    }

}
