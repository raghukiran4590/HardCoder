package lambdas;

import com.mongodb.internal.async.function.AsyncCallbackRunnable;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    // Consumer<T> interface has accept() method and takes an input and applies logic but does not return any output.

    public static void main(String[] args) {
        int i = 10;
        Consumer<Integer> consumer = t -> System.out.println(String.format("Printing : %s", t));
        consumer.accept(i);

        List<Integer> a = Arrays.asList(1,2,3,4,5);
        a.forEach(t -> System.out.println("Print : "+t));
    }
}
