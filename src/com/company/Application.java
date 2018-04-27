package com.company;



public class Application {
    public static void main(String[] args) {

        Shop product= new Shop<Food>(null);
        Shop detskij = new Shop<Toy>(null);
        Shop stroyMag = new Shop<Tools>(null);
        System.out.println(product);
        System.out.println(detskij);
        System.out.println(stroyMag);
        Food apple = new Food("Apple", 145);
        Food pineapple = new Food("Pineapple", 145);
        product.add(pineapple);
        product.add(apple);
        Toy nevaliashka = new Toy ("Nevaliashka",200);
        Toy toyGun= new Toy ("Gun", 180);
        detskij.add(nevaliashka);
        detskij.add(toyGun);
        System.out.println(product);
        System.out.println(detskij);
        System.out.println(stroyMag);
        Tools molotok= new Tools("Molotok",170);
        Tools gvozdi= new Tools("Gvozdi", 20);
        Customer pavel= new Customer("Pavel",null,1500);
        System.out.println(pavel);
        product.buy(pavel,apple);
        System.out.println(pavel);
        System.out.println(product);
        System.out.println(detskij);
        System.out.println(stroyMag);

    }
}
