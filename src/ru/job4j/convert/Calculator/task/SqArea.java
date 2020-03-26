package ru.job4j.convert.Calculator.task;

public class SqArea {
    public static double Area(double p, double k) {
        double h = p / (2 * (k + 1));
        double L=k*h;
        double S=L*h;
        return (S);
    }
    public static void main(String[]args){
double r =   SqArea.Area(6, 2);
System.out.println(r);


    }
}
