package com.company;

public class Toy extends Good {
    public Toy(String name, int price) {
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
