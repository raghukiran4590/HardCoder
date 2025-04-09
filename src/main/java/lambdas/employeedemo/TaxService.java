package lambdas.employeedemo;

import java.util.List;
import java.util.stream.Collectors;

//Service Layer
public class TaxService {

    public static List<Employee> evaluateTaxUsers(String input) {
        return input.equalsIgnoreCase("tax") ? Database.getEmployees().stream().filter(emp -> emp.getSalary() > 100000).collect(Collectors.toList())
                : Database.getEmployees().stream().filter(emp -> emp.getSalary() <= 100000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers("tax"));
        System.out.println(evaluateTaxUsers("non tax"));
    }
}
