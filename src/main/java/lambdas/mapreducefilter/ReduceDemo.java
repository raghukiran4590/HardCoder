package lambdas.mapreducefilter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6);
//        System.out.println(numbersList);

        int sum1 = numbersList.stream().mapToInt(i -> i).sum(); //Using parallel processing
//        System.out.println(sum1);

        Integer reduceSum = numbersList.stream().reduce(0, (a, b) -> a + b);
//        System.out.println(reduceSum);

        Optional<Integer> reduceSum2 = numbersList.stream().reduce(Integer::sum); //Using method reference
//        System.out.println(reduceSum2.get());

        Integer reduceMultiply = numbersList.stream().reduce(1, (a, b) -> a * b); //Using lambda expression
//        System.out.println(reduceMultiply);

        Optional<Integer> MaxNumber = numbersList.stream().reduce((a, b) -> a > b ? a : b); //Using ternary condition
//        System.out.println(MaxNumber.get());

        Optional<Integer> reduceMax = numbersList.stream().reduce(Integer::max); //Using max method reference
//        System.out.println(reduceMax.get());

        List<EmployeeGrades> allEmployees = EmployeeDatabase.getAllEmployees();
        double employeeAvgSalary = allEmployees.stream().filter((employeeGrades -> employeeGrades.getGrade().equalsIgnoreCase("A")))
                .map(EmployeeGrades::getSalary)
                .mapToDouble(value -> value)
                .average().getAsDouble();

        System.out.println(employeeAvgSalary);

        double sumSalary = allEmployees.stream().filter((employeeGrades -> employeeGrades.getGrade().equalsIgnoreCase("A")))
                .map(EmployeeGrades::getSalary)
                .mapToDouble(value -> value)
                .sum();

        System.out.println(sumSalary);

    }
}
