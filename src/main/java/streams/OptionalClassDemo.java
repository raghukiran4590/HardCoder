package streams;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {

        Optional<String> name = getName(2);
//        name.ifPresent(System.out::println);
//        String na = name.orElse("NA");
//        String elseGet = name.orElseGet(() -> "NA");
        String orElseThrow = name.orElseThrow(NoSuchElementException::new);
//        System.out.println(orElseThrow);
        Optional<String> optionalS = name.map(String::toUpperCase);
        optionalS.ifPresent(System.out::println);
    }

    public static Optional<String> getName(int id) {
//        String name = null;
//        return Optional.ofNullable(name);
//    return Optional.empty(); //returns null
        return Optional.of("raghu");
    }
}
