package lambdas.mapreducefilter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapFlatMapDemo {

    public static void main(String[] args) {
//        create list of customer objects
//        use map() function to return stream of customer emails
//        use flatmap() function to flatten and return customer phone numbers

        List<Customer> allCustomers = EkartDatabase.getAllCustomers();
        List<Optional<String>> customerEmailList = allCustomers.stream().map(Customer::getEmail).collect(Collectors.toList());
//        System.out.println(customerEmailList);
        List<String> customerPhoneNumbers = allCustomers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(customerPhoneNumbers);
        Collections.reverse(customerPhoneNumbers);
        System.out.println(customerPhoneNumbers);


    }
}
