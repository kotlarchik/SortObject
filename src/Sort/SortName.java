package Sort;

import sapteh.Person;

import java.util.Comparator;

public class SortName implements Comparator<Person> {
    @Override
    public int compare(Person name1, Person name2) {
        return name1.getName().compareTo(name2.getName());
    }
}
