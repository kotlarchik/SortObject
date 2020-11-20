package Sort;

import sapteh.Person;

import java.util.Comparator;

public class SortMoney implements Comparator<Person> {
    @Override
    public int compare(Person money1, Person money2) {
        return money1.getMoney() - money2.getMoney();
    }
}
