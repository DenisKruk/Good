package com.company;

public class Tools extends Good {
    public Tools(String name, int price) {
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Tools{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
