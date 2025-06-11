package basic;

import java.util.*;

public class Employee implements Comparable<Employee> {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name);
    }

    @Override
    public boolean equals(Object o) {
        //if both have the same reference value
        if (this == o) return true;
        // if class is null or if o is of different class
        if(o == null || o.getClass() != getClass()) return false;
        // check the values
        Employee emp = (Employee) o;
        return id == emp.id && Objects.equals(name, emp.name);
    }

    @Override
    public String toString() {
        return "[" +
                "Employee : " +
                "{" +
                "name: "+this.name + ","+
                "id: "+this.id+
                "}]";
    }

    public static void main(String[] args) {
        Employee employee = new Employee("raghu", 101);
        System.out.println(employee);
        Employee employee1 = employee;
        System.out.println(employee1);
        System.out.println(employee.equals(employee1));
        Employee employee2 = new Employee("Vriha", 542);
        System.out.println(employee2);
        System.out.println(employee.hashCode());
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
        System.out.println(employee.equals(employee2));
        System.out.println(employee.compareTo(employee1));
        System.out.println(employee1.compareTo(employee2));
        System.out.println(employee2.compareTo(employee1));

        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee("Tinku", 123);
        Employee emp2 = new Employee("Bunty", 987);
        Employee emp3 = new Employee("Chintu", 234);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        System.out.println(employeeList);
        employeeList.sort((a,b) -> a.name.compareTo(b.name));
        System.out.println(employeeList);
        employeeList.sort(new MyEmployeeComparator());
        System.out.println(employeeList);
    }

    @Override
    public int compareTo(Employee o) {
        if(Objects.equals(id, o.id)) {
            return 0;
        } else if (id > o.id) {
            return 1;
        } else {
          return -1;
        }
    }
}
