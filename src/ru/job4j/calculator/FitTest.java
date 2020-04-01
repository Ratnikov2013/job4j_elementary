package ru.job4j.calculator;
import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public static void manWeight(double height) {
        double in = 174;
        double expected = 85.1;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public static double womanWeight(double height) {
        double in = 172;
        double expected = 71.3;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);

        return in;
    }
}

