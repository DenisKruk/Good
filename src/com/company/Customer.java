package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Customer {
    public  String name;
    public  List<Good> bag;
    public  int money;

    public Customer(String name, List<Good> bag, int money) {
        this.name = name;
        this.bag = new ArrayList<>();
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return money == customer.money &&
                Objects.equals(name, customer.name) &&
                Objects.equals(bag, customer.bag);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, bag, money);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", bag=" + Arrays.toString(bag.toArray()) +
                ", money=" + money +
                '}';
    }
}

