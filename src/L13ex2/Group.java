package L13ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Group<S> implements Cloneable {
    public List<Student> group;

    public Group(List<Student> group) {
        this.group = new ArrayList<Student>();
    }

    @Override
    public String toString() {
        return "Group{"
                 + Arrays.toString(group.toArray()) +
                '}';
    }

    @Override
    protected Group<S> clone() throws CloneNotSupportedException {
        Group<S> nGroup=(Group<S>) super.clone();
        return nGroup;
    }

    public void add(Student stas, Student den, Student igor, Student alex, Student luba, Student... studentsGroup) {
        for (Student student : studentsGroup) {

            group.add(student);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group<S> group1 = (Group<S>) o;
        return Objects.equals(group, group1.group);
    }

    @Override
    public int hashCode() {

        return Objects.hash(group);
    }
}