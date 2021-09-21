package ru.geekbrains.java_algoritms_homework_5;

public class Main {

    public static void main(String[] args) {
        System.out.println(exponentiation(3, 7)); // Вызов метода возведения в степень
    }

    public static int exponentiation(int a, int x) { // Метод возведения в степень
        if (x == 2) {
            return a * a;
        }
        return exponentiation(a, x - 1) * a;
    }
}
