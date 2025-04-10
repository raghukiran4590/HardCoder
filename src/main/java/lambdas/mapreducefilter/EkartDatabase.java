package lambdas.mapreducefilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {

    public static List<Customer> getAllCustomers() {
        return Stream.of(
                new Customer(101, "Raghu", "raghukiran4590@gmail.com", Arrays.asList("3273487365873", "77864365465")),
                new Customer(102, "Neetha", "neethakiranus@gmail.com", Arrays.asList("45354354534545", "234354354")),
                new Customer(103, "Vriha", "vrihakiran@gmail.com", Arrays.asList("6785678678", "89089879879")),
                new Customer(104, "Ravi", "ravi09@gmail.com", Arrays.asList("124234345345", "6787978980"))
        ).collect(Collectors.toList());
    }

}
