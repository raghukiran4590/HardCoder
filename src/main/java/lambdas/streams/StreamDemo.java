package lambdas.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamDemo {
    public static void main(String[] args) {
        //stream() method to list objects sequentially
        List<String> names = new ArrayList<>();
        names.add("Raghu");
        names.add("Ravi");
        names.add("Neetha");
        names.add("Vriha");
        names.add("Naveen");

        System.out.println(names);
        names.stream().forEach((t) -> System.out.println(t));

        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(1, "Raghu");
        namesMap.put(2, "Ravi");
        namesMap.put(3, "Neetha");
        namesMap.put(4, "Vriha");
        namesMap.put(5, "Naveen");

        System.out.println(namesMap);
        namesMap.forEach((k,v) -> System.out.println(k+" : "+v));
        namesMap.entrySet().forEach((e) -> System.out.println(e));
    }
}
