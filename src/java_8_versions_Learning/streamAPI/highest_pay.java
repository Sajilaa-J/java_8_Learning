package java_8_versions_Learning.streamAPI;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class highest_pay  {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Prasanna", 55000),
                new Employee("Sajilaa", 75000),
                new Employee("Arun", 68000),
                new Employee("Meena", 92000)
        );

        Employee highestPaid = employees.stream()
                .max(Comparator.comparingDouble(e -> e.salary))
                .orElse(null);

        System.out.println("Highest Paid: " + highestPaid.name + " - " + highestPaid.salary);
    }
}