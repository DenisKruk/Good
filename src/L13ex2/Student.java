package L13ex2;

import java.util.Objects;

public class Student {
    public String name;
    public int money;

    public  Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void spendSomeMoney() {
        money -= (int)(Math.random()*1000);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student studend = (Student) o;
        return money == studend.money &&
                Objects.equals(name, studend.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
