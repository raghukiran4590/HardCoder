package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {
    public static void main(String[] args) {
        //Method Reference --> Use method without invoing & in place of lambda expression
         List<String> students = Arrays.asList("Ram", "Shyam", "Krishna");
         students.forEach(x-> System.out.println(x));
        students.forEach(System.out::println);

        //Constructor Reference
        List<String> phonesList = Arrays.asList("A", "B", "C");
//        List<MobilePhone> mobilePhoneList = phonesList.stream().map(x -> new MobilePhone(x)).collect(Collectors.toList());
        List<MobilePhone> mobilePhoneList = phonesList.stream().map(MobilePhone::new).collect(Collectors.toList());
        System.out.println(mobilePhoneList);

    }
}

class MobilePhone {
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}
