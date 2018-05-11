package Lesson14;


import java.util.*;

public class Car implements Comparable {
    private int year;
    private Colour colour;

    public Car(int year, Colour colour) {
        this.year = year;
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public Colour getColour() {
        return colour;
    }

    @Override
    public int compareTo(Object car) {
        if (car instanceof Car) {
            Car realCar = (Car) car;
            if (this.getYear() > realCar.getYear()) {
                return 1;
            }
            if (this.getYear() < realCar.getYear()) {
                return -1;
            }
            if (this.getYear() == realCar.getYear()) {
                return 0;
            }
        }
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        if (year != car.year) return false;
        return colour == car.colour;
    }

    public static void main(String[] args) {
//
        Car blackCar = new Car(1990, Colour.BLACK);
        Car anotherCar = new Car(1990, Colour.BLACK);
//       System.out.println(blackCar.equals(anotherCar));
//       System.out.println(blackCar.getColour());
//       System.out.println(blackCar.compareTo(new Object()));
//       System.out.println(blackCar.compareTo(anotherCar));
        Car greenCar=new Car(2000,Colour.GREEN);
//        System.out.println(blackCar.compareTo(greenCar));
//        List<Car> cars= new ArrayList<>();
//        cars.add(greenCar);
//        cars.add(blackCar);
//        cars.add(anotherCar);
//        Collections.sort(cars);
//        System.out.println(cars.get(0).getYear());
     Set<Car>cars=new HashSet<>();
     cars.add(blackCar);
        System.out.println(blackCar.hashCode());
     cars.add(anotherCar);
        System.out.println(anotherCar.hashCode());
     cars.add(greenCar);
        System.out.println(greenCar.hashCode());
        System.out.println(cars.size());

    }


    @Override
    public int hashCode() {
        int result= year;
        result=31*result +//принято вводить 31 для быстродействия
                +(colour !=null?colour.hashCode():0);
        return result;
    }
}
