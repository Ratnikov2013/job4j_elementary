package ru.job4j.calculator;
import org.junit.Assert;
import org.junit.Test;
public class FitTest {


    @Test
    public void womanWeight() {
        double in = 172;
        double expected = 71.3;
       double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out);

    }
}



