package lambdas.mapreducefilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Raghu");
        names.add("Ravi");
        names.add("Neetha");
        names.add("Vriha");
        names.add("Naveen");

        names.stream().filter((s) -> s.startsWith("N")).forEach(System.out::println);

        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(1, "Raghu");
        namesMap.put(2, "Ravi");
        namesMap.put(3, "Neetha");
        namesMap.put(4, "Vriha");
        namesMap.put(5, "Naveen");

        namesMap.entrySet().stream().filter(k->k.getKey()%2==0).forEach(k-> System.out.println(k.getValue()));
        namesMap.forEach((k,v)-> System.out.println(k.intValue()+":"+v.toString()));
    }
}
