package com.company;



public class Application {
    public static void main(String[] args) {

         Shop<Food> product= new Shop<Food>("Products",null);
        Shop<Toy> detskij = new Shop<Toy>("Detskij",null);
        Shop<Tools> stroyMag = new Shop<Tools>("StroyMag",null);
        Food apple = new Food("Apple", 145);
        Food pineapple = new Food("Pineapple", 145);
        product.add(pineapple);
        product.add(apple);
        Toy nevaliashka = new Toy ("Nevaliashka",200);
        Toy toyGun= new Toy ("Gun", 180);
        detskij.add(nevaliashka,toyGun);
        detskij.add(toyGun);
        Tools molotok= new Tools("Molotok",170);
        Tools molotok1= new Tools("Molotok1",170);

        Tools gvozdi= new Tools("Gvozdi", 20);
        stroyMag.add(molotok);
        stroyMag.add(gvozdi);
        System.out.println(product+"\n"+detskij+"\n"+stroyMag);
        Customer pavel= new Customer("Pavel",null,1500);
        System.out.println(pavel);
        product.buy(pavel, molotok1,gvozdi);
        System.out.println(pavel);
        System.out.println(product);
        System.out.println(detskij);
        System.out.println(stroyMag);

    }
}
