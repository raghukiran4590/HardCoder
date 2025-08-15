package interviewpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("message", "Map Message");
        map.put("success", "false");
        map.put("status", "NOT_FOUND");
        System.out.println(map);

    }
}
