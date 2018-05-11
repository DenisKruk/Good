package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class Shop<G extends Good>{
    String name;
    List<G> goods;
    public Shop(String name,List<G> goods){
        this.name=name;
        this.goods= new ArrayList<G>();
    }



    public void add (G ... goodsFromProvider){
        for (G good : goodsFromProvider) {

            goods.add(good);
        }
    }

    public void buy( Customer customer,Good ... goodsForCustumer) {
        for (Good good:goodsForCustumer) {
//           if(goods.contains(good){
//
//            }
        try {
            System.out.println( good.getClass());
            System.out.println( goods.getClass());
            if(goods.contains(good)) {

                if (good.price <= customer.money) {
                    customer.bag.add(good);
                    goods.remove(good);
                    customer.money -= good.price;
                } else {
                    System.out.println("Not enough money");
                }
            }
             throw new IllegalStateException();

            } catch(IllegalStateException e) {
            System.out.println("Нет такого товара");
        }
            }

    }

    @Override
    public String toString() {
        return "Shop "+name+"{" +
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
