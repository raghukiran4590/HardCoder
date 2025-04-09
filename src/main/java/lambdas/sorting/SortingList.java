package lambdas.sorting;

import lambdas.employeedemo.Database;
import lambdas.employeedemo.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(12);
        list.add(15);
        list.add(2);

        //Using Collections.sort method
//        System.out.println(list);
        Collections.sort(list); //Ascending Order
//        System.out.println(list);
        Collections.reverse(list); //Descending Order
//        System.out.println(list);

        // Using stream().sorted() method
//        list.stream().sorted().forEach(s-> System.out.println(s));
//        list.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.println(s));

        List<Employee> employeeList = Database.getEmployees();
        Collections.sort(employeeList, (e1, e2) -> (int) (e1.getSalary() - e2.getSalary()));
//        System.out.println(employeeList);
        //Using lambda expression with sorted method
//        employeeList.stream().sorted((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).forEach(System.out::println);
        //Using stream().sorted(comparator)
//        employeeList.stream().sorted(Comparator.comparing(employee -> employee.getSalary())).forEach(System.out::println);
        //Using stream().sorted(comparator.methodReference)
          employeeList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
    }

}
