package concurrency;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Callable Demo";
    }

    public static void main(String[] args) throws Exception {
        CallableDemo callableDemo = new CallableDemo();
        String call = callableDemo.call();
        System.out.println(call);
    }
}
