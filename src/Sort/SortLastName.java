package Sort;

import sapteh.Person;

import java.util.Comparator;

public class SortLastName implements Comparator<Person> {
    @Override
    public int compare(Person lastName1, Person lastName2) {
        return lastName1.getLastName().compareTo(lastName2.getLastName());
    }
}
