
package ru.job4j.condition;

public class Max {
    public static String max(int first, int second) {
        String result = (first > second ? "first Max." : "second Max.");
        return result;
    }
    public static void main(String[]args) {
        String result = Max.max(1, 2);
        System.out.println(result);
    }
}
