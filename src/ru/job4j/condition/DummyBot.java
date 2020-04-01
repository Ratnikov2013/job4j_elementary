package ru.job4j.condition;

public class DummyBot {
    public static void answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";

        if ("Привет, Бот.".equals("Привет умник.")) {
            rsl = "Привет умник.";
        }
        if ("Пока.".equals("До скорой встречи.")) {
            rsl = "До скорой встречи.";
        } else {
            System.out.println("Это ставит меня в тупик. Задайте другой вопрос");
        }
    }
}





