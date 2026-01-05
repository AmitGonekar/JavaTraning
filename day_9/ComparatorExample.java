package day_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(2,"Rahul"));
        list.add(new Employee(3,"Amit"));
        list.add(new Employee(1,"Boby"));

        Collections.sort(list, new NameComparator());

        for(Employee e : list){
            System.out.println(e.id+ " "+e.name);
        }
    }
}
