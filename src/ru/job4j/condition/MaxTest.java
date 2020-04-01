package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
       String result = Max.max(1, 2);
        assertThat(result, is("second Max."));
    }
}