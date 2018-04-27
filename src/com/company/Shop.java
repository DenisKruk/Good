package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class Shop<G extends Good>{
    List<G> goods;
    public Shop(List<G> goods){
    this.goods= new ArrayList<G>();
    }



    public void add (G good){
    goods.add(good);
    }

    public void buy( Customer customer,Good good){
        if(good.price<=customer.money){
            customer.bag.add(good);
            goods.remove(good);
            customer.money-=good.price;
        }
else {
            System.out.println("Not enough money");
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "goods=" + Arrays.toString(goods.toArray()) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop<?> shop = (Shop<?>) o;
        return Objects.equals(goods, shop.goods);
    }

    @Override
    public int hashCode() {

        return Objects.hash(goods);
    }
}
