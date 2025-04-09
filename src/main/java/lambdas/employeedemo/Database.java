package lambdas.employeedemo;

import java.util.ArrayList;
import java.util.List;

//DAO Layer
public class Database {

    public static List<Employee> getEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Raghu", "IT", 90000L));
        employeeList.add(new Employee(2, "Vriha", "Medical", 900000L));
        employeeList.add(new Employee(3, "Neetha", "Pharma", 75000L));
        employeeList.add(new Employee(4, "Ravi", "Education", 120000L));
        return employeeList;

    }
}
