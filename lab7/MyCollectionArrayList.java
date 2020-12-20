package ru.mirea.lab7;
import java.util.ArrayList;

public class MyCollectionArrayList {

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<String>();
        name.add("Павел");
        name.add("Александр");
        name.add("Сергей");
        name.add("Арсен");

        System.out.printf("В офисе %d сотрудников. \n", name.size());
        for(String employee : name){
            System.out.println(employee);
        }

        name.add(0, "Иван");
        name.add(5, "Николай");

        System.out.printf("В офис устроились новые сотрудники. Теперь их %d. \n", name.size());
        for(String employee : name){
            System.out.println(employee);
        }

        name.add(6, "Олег");

        if(name.contains("Олег")){
            System.out.println("Также в офисе есть сотдрудник Олег. \n");
        }

        System.out.println(name.get(6));
        name.set(6, "у него фамилия Грошко Олег");
        System.out.println("Олег ‐ главный оператор. \n");

        name.remove(4);

        Object[] peoples = name.toArray();
        for(Object people : peoples){
            System.out.println(people);
        }

    }

}
