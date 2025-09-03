package StreamPackage;


import java.util.Arrays;
import java.util.List;

class Employees{
    String name;
    int age;
    Employees(String name,int age){
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
public class older_than_25 {
    public static void main(String[] args)
    {
        List<Employees> employees = Arrays.asList(
                new Employees("Prasanna", 22),
                new Employees("Sajilaa", 26),
                new Employees("Arun", 30),
                new Employees("Meera", 24)
        );


        employees.stream()
                .filter(a->a.age>25)
                .forEach(a -> System.out.println(a.name + " (" + a.age + ")"));

    }
    }

