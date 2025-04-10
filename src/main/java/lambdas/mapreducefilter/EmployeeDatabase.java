package lambdas.mapreducefilter;

import lambdas.employeedemo.Employee;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {

    public static List<EmployeeGrades> getAllEmployees() {
        List<EmployeeGrades> employeeGradesList = new ArrayList<>();
        employeeGradesList.add(new EmployeeGrades(101, "Raghu", "A", "IT", 90000L));
        employeeGradesList.add(new EmployeeGrades(102, "Vriha", "A", "MECH", 5000000L));
        employeeGradesList.add(new EmployeeGrades(103, "Neetha", "B", "ELEC", 70000L));
        employeeGradesList.add(new EmployeeGrades(104, "Neelu", "C", "CIVIL", 170000L));
        return employeeGradesList;
    }
}
