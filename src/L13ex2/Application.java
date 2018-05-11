package L13ex2;



public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        Group <Student> javaSE = new Group<Student>(null);
        Student stas = new Student("Stas",1800);
        Student den = new Student("Den",1500);
        Student igor = new Student("Igor",1900);
        Student alex = new Student("Alexandra",2100);
        Student luba = new Student("Luba",1600);
        javaSE.add(stas,den,igor,alex,luba);
        System.out.println(javaSE);

        Group<Student> javaEE= (Group<Student>) javaSE.clone();

        igor.spendSomeMoney();
        den.spendSomeMoney();
        System.out.println(javaSE);
        System.out.println(javaEE);
    }
}
