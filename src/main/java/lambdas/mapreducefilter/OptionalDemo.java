package lambdas.mapreducefilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static Optional<Customer> getCustomerWithEmail(String email) throws Exception {
        List<Customer> allCustomers = EkartDatabase.getAllCustomers();
        Optional<Customer> customer1 = Optional.of(allCustomers.stream()
                .filter((customer -> customer.getEmail().equals(email))).findAny()
                .orElseThrow(() -> new Exception("Email not found")));
        return customer1;
    }

    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(542, "cutie", "tinku@gmail.com", Arrays.asList("23341342"));
        System.out.println(customer);
//        Optional<String> email = Optional.ofNullable("tinku@gmail.com");
//        Optional.ofNullable(customer.getEmail()).orElseThrow(()-> new IllegalArgumentException("email not present"));
//        System.out.println(s);
//        System.out.println(Optional.ofNullable(customer.getEmail()).map(String::toUpperCase).orElseGet(() -> "default email..."));
        Optional<Customer> customerWithEmail = getCustomerWithEmail("raghukiran4590@gmail.com");
        System.out.println(customerWithEmail);
    }
}
