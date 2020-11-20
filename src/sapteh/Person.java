package sapteh;

public class Person {
    private String name;
    private String lastName;
    private String patronomyc;
    private int age;
    private int money;

    public Person(String name, String lastName, String patronomyc, int age, int money){
        this.name = name;
        this.lastName = lastName;
        this.patronomyc = patronomyc;
        this.age = age;
        this.money = money;
    }

    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPatronomyc(){
        return patronomyc;
    }
    public int getAge(){
        return age;
    }
    public int getMoney(){
        return money;
    }

    public String toString(){
        return String.format("Фамилия: %s | Имя: %s | Отчество: %s | Возраст: %d | Зарплата: %d\n",
                getLastName(), getName(), getPatronomyc(), getAge(), getMoney());
    }
}
