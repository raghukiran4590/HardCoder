package basic;

import java.util.Comparator;

public class MyEmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.id, o2.id);
    }
}
