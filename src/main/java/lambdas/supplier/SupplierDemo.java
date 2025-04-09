package lambdas.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    //Supplier<String> does not take any input but returns a result of Type <T>.
    //This interface is used to return any results from your stream,map,filter,reduce functions.

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hi Hard Coder!";
//        System.out.println(supplier.get());

//        List<String> stringList = Arrays.asList("a", "b", "c");
        List<String> stringList = Arrays.asList();
        System.out.println(stringList.stream().findAny().orElseGet(supplier));
    }
}
