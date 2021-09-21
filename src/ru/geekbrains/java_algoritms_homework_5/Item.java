package ru.geekbrains.java_algoritms_homework_5;

public class Item { // Класс объекта с заданными параметрами
    private String name;
    private int weight, price;

    public Item(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    } // Геттер имени

    public int getWeight() {
        return weight;
    } // Геттер веса

    public int getPrice() {
        return price;
    } // Геттер цены

    public void printItem() { // Метод вывода параметров объекта в консоль
        System.out.print(getName() + ", weight: " + getWeight() + ", price: " + getPrice());
        System.out.println();
    }
}
