package ru.geekbrains.java_algoritms_homework_5;

import java.util.ArrayList;

public class Backpack { // Класс рюкзака с параметрами и методами нахождения лучшей комбинации
    ArrayList<Item> bpArr = new ArrayList<>(); // Создание списка объектов для нахождения лучшей комбинации
    private int bpCapacity; // Максимальная грузоподъёмность рюкзака
    private int maxPrice; // Переменная, хранящая в себе максимальную цену

    public Backpack(int bpCapacity) {
        this.bpCapacity = bpCapacity;
    }

    private int sumWeight(ArrayList<Item> arr) { // Сумма весов всех объектов списка
        int sum = 0;
        for (Item item : arr) {
            sum += item.getWeight();
        }
        return sum;
    }

    private int sumPrice(ArrayList<Item> arr) { // Сумма цен всех объектов списка
        int sum = 0;
        for (Item item : arr) {
            sum += item.getPrice();
        }
        return sum;
    }

    private void checkSet(ArrayList<Item> arr) { // Проверка полученного набора на лучшую комбинацию
        if (bpArr.isEmpty()) {
            if (sumWeight(arr) <= bpCapacity) { // Если сумма весов меньше или равна грузоподъёмности рюкзака, переписываем список и значение максимальной цены
                bpArr = arr;
                maxPrice = sumPrice(arr);
            }
        } else if (sumWeight(arr) <= bpCapacity && sumPrice(arr) > maxPrice) { // Если сумма цен больше, перезаписываем значения снова
            bpArr = arr;
            maxPrice = sumPrice(arr);
        }
    }

    public void searchBestCombination(ArrayList<Item> arr) { // Метод поиска наилучшей комбинации с использованием рекурсии
        if (!arr.isEmpty()) {
            checkSet(arr);
            for (int i = 0; i < arr.size(); i++) {
                ArrayList<Item> tempList = new ArrayList<>(arr);
                tempList.remove(i); // Удаление одного объекта
                searchBestCombination(tempList); // Вызов рекурсии с уменьшенным количеством объектов
            }
        }
    }
    public ArrayList<Item> getResultList() { // Возвращение полученного списка оптимального решения
        return bpArr;
    }
}
