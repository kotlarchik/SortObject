package Sort;

import sapteh.Person;

import java.util.Comparator;

public class SortPatronomyc implements Comparator<Person> {
    @Override
    public int compare(Person patronomyc1, Person patronomyc2) {
        return patronomyc1.getPatronomyc().compareTo(patronomyc2.getPatronomyc());
    }
}
