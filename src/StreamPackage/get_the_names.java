package StreamPackage;

import java.util.Arrays;
import java.util.List;

class Employee{
    String name;
    int age;
    Employee(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class  get_the_names {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Prasanna", 22),
                new Employee("Sajilaa", 26),
                new Employee("Arun", 30),
                new Employee("Meera", 24)
        );


        employees.stream()
                .map(a -> a.age)
                .forEach(System.out::println);


    }
}

