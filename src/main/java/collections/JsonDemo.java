package collections;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class JsonDemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        JSONObject obj = new JSONObject();

        JSONArray records = new JSONArray();

        JSONArray dbs = new JSONArray();

        Set<String> dbSet = new HashSet<>();

        dbSet.add("Apple");
        dbSet.add("Banana");
        dbSet.add("Mango");

        System.out.println(dbSet);

        JSONObject instance = new JSONObject();

        instance.put("u_capture_dttm", LocalDate.now() + " " + LocalTime.now());

        instance.put("u_instance_sys_id", "037dc119c3ff4650bb95d72a0501315d");

        instance.put("u_db_type", "SQL SERVER");

        instance.put("u_production_ind", "Y");

        instance.put("u_database_name", dbSet);

        records.add(instance);

        obj.put("records", records);

        String dbinfoObject = obj.toString();

        System.out.println(dbinfoObject);

    }
}
