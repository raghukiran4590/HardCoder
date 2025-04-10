package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddingElementsinList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie")); //Using Arrays.asList
        System.out.println(names);
        names.add("Raghu");
        System.out.println(names);

        ArrayList<Integer> numbers = new ArrayList<>() {{
            add(10);
            add(20);
            add(30);
        }};
        System.out.println(numbers);

        List<String> colors = List.of("Red", "Green", "Blue"); //Using Java9+ List.of()
        System.out.println(colors);

        ArrayList<String> colorsList = new ArrayList<>(colors);
        System.out.println(colorsList);
    }
}
