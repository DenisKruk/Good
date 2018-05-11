package Lesson15;

import java.util.*;

public class SetExamples {
    private static void soutSet(Set set) {
        for (Object s : set) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        String nick = "Nick";
        String ivan = "Ivan";
        String vasily = "Vasily";
        names.add(nick);
        names.add(ivan);
        names.add(vasily);
        names.add("Ivan");
        soutSet(names);
        Person nickPerson = new Person("Nick");
        Person nickPerson2 = new Person("Nick");
        Person ivanPerson = new Person("Ivan");
        LinkedHashSet<Person> persons = new LinkedHashSet<>();
        persons.add(nickPerson);
        persons.add(nickPerson2);
        persons.add(ivanPerson);
        soutSet(persons);

        LinkedHashSet<Person>linkedPersons=new LinkedHashSet<>();
        linkedPersons.add(nickPerson);
        linkedPersons.add(nickPerson2);
        linkedPersons.add(ivanPerson);
        linkedPersons.add(new Person("Vlad"));
        soutSet(linkedPersons);

        TreeSet<Person>treePerson=new TreeSet<>();
        treePerson.add(nickPerson);
        treePerson.add(nickPerson2);
        treePerson.add(ivanPerson);
        soutSet(treePerson);

        Comparator<Person> personComparator=new Comparator<Person>(){
            @Override
            public int compare(Person o1,Person o2){
                return Integer.compare(o1.getAge(),(o2.getAge()));
            }
        };
        TreeSet<Person>anoterTreePerson=new TreeSet<>(personComparator);
        anoterTreePerson.add(new Person("Stepan",50));
        anoterTreePerson.add(new Person("Ignat",15));
        anoterTreePerson.add(new Person("Svetlana",30));
        soutSet(anoterTreePerson);


    }

}
