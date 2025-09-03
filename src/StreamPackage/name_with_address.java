package StreamPackage;

import java.util.Arrays;
import java.util.List;

class Employe{
    String name;
    int age;

    Employe(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class name_with_address {
    public static void main(String[] args) {
        List<Employe> employees = Arrays.asList(
                new Employe("Prasanna", 22),
                new Employe("Sajilaa", 26),
                new Employe("Arun", 30),
                new Employe("Meera", 24)
        );

        // Print name and age using forEach
        employees.forEach(e -> System.out.println(e.name + " - " + e.age));
    }
}
