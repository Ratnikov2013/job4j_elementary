package ru.job4j.calculator;


public class Fit {
    public static double manWeight(double height) {
        double r = (height - 100) * 1.15;
        return r;

    }
    public static double womanWeight(double height) {
        double r = (height - 110) * 1.15;
        return r;
    }

    public static void main(String[]args) {
        double woman = Fit.womanWeight(172);


        System.out.println(woman);

        double man = Fit.manWeight(174);
        System.out.println(man);
    }




    }


