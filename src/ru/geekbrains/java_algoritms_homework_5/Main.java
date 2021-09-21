package ru.geekbrains.java_algoritms_homework_5;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        System.out.println(exponentiation(3, 7)); // Вызов метода возведения в степень

        ArrayList<Item> itemList = new ArrayList<>(); // Заполнение списка элементов
        itemList.add(new Item("Item 1", 3, 26));
        itemList.add(new Item("Item 2", 2, 31));
        itemList.add(new Item("Item 3", 4, 39));
        itemList.add(new Item("Item 4", 6, 35));
        itemList.add(new Item("Item 5", 8, 37));
        itemList.add(new Item("Item 6", 5, 29));
        itemList.add(new Item("Item 7", 1, 24));
        print(itemList); // Вывод всех вещей в консоль

        Backpack backpack = new Backpack(5); // Создание рюкзака с ограничением грузоподъёмности
        backpack.searchBestCombination(itemList); // Поиск наилучшей комбинации
        System.out.println("Best items combination:");
        print(backpack.getResultList()); // Вывод наилучшей комбинации в консоль
    }

    public static int exponentiation(int a, int x) { // Метод возведения в степень
        if (x == 2) {
            return a * a;
        }
        return exponentiation(a, x - 1) * a;
    }

    public static void print(ArrayList<Item> itemList) { // Метод печати листа
        for (Item item : itemList) {
            item.printItem();
        }
        System.out.println();
    }
}
