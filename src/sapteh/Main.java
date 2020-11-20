package sapteh;

import Sort.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Person> personList = new ArrayList<>();
        String nameFile = "text.txt";
        // Create at file
        File file = new File(nameFile);
        if (file.createNewFile()){
            System.out.println("Успешно :)");
        } else {
            System.out.println("Файл уже существует");
        }
        // Read at file
        try (BufferedReader reader = new BufferedReader(new FileReader(nameFile))){
            while (reader.ready()){
                String read = reader.readLine();
                Person person = getPerson(read);
                personList.add(person);
            }
        }
        personList.sort(new SortMoney());

        File file1 = new File("text(rew).txt");
        FileWriter fileWriter = new FileWriter(file1);
        for(Person person : personList){
            fileWriter.write(person.toString());
        } fileWriter.close();
    }
    public static Person getPerson(String read){
        String[] strings = read.split(" ");
        String name = strings[1];
        String lastName = strings[0];
        String patronomyc = strings[2];
        int age = Integer.parseInt(strings[3]);
        int money = Integer.parseInt(strings[4]);
        return new Person(name, lastName, patronomyc, age, money);
    }
}
