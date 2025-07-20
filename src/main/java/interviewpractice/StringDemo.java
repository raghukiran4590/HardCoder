package interviewpractice;

import basic.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringDemo {

    public static void main(String[] args) {
//        String s1 = "Hello";
//        String s2 = "Hello";
//
//        System.out.println(s1 == s2);

        List<Employee> employeeList = Arrays.asList(new Employee("Raghu", 123),
                new Employee("Neetha", 345), new Employee("Vriha", 442));

        System.out.println(employeeList);

        employeeList.stream().filter(employee -> employee.getId()>300).forEach((employee -> {
            System.out.println(employee.getName());
        }));

        Predicate<Employee> employeePredicate = employee -> {
            return employee.getId() > 400;
        };

        Predicate<Employee> employeePredicate2 = employee -> {
            return employee.getId() < 200;
        };

        List<Employee> employees = employeeList.stream().filter(employeePredicate.or(employeePredicate2)).toList();
        System.out.println(employees);
    }
}
