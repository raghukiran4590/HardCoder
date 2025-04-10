package lambdas.sorting;

import lambdas.employeedemo.Employee;

import java.security.KeyStore;
import java.util.*;

public class SortingMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Eight", 8);
        map.put("Two", 2);
        map.put("Six", 6);
        map.put("Four", 4);

//        System.out.println(map);
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, ((o1, o2) -> o1.getKey().compareTo(o2.getKey())));
//        System.out.println(entries);

       /* for(Map.Entry<String, Integer> entry: entries) {
            System.out.println(entry.getKey() + "   "+entry.getValue());
        }*/

//        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        Map<Employee, Integer> employeeMap = new TreeMap<>(((o1, o2)-> (int) (o2.getSalary() - o1.getSalary())));
        employeeMap.put(new Employee(176, "Roshan", "IT", 60000), 60);
        employeeMap.put(new Employee(388, "Vriha", "CIVIL", 70000), 90);
        employeeMap.put(new Employee(470, "Neetha", "MECHANICAL", 80000), 80);
        employeeMap.put(new Employee(624, "Prakash", "ELECTRICAL", 90000), 40);

        //in one line whole as a map
//        System.out.println(employeeMap);
        //print sequentially in separate lines
        employeeMap.entrySet().stream().forEach(System.out::println);

       employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed())).forEach(System.out::println);
    }
}
