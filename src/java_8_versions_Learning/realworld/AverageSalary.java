package java_8_versions_Learning.realworld;


import java.util.*;
import java.util.stream.*;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class AverageSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Prasanna", "IT", 55000),
                new Employee("Sajilaa", "HR", 60000),
                new Employee("Arun", "IT", 75000),
                new Employee("Divya", "Finance", 70000)
        );


        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));


        avgSalaryByDept.forEach((dept, avgSalary) ->
                System.out.println(dept + " : " + avgSalary));
    }
}
