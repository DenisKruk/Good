package Lesson15;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    private static void soutMap(Map<? extends Object, ? extends Object> map) {
        for (Map.Entry<? extends Object, ? extends Object> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("Key =" + key + ", value = " + value);
        }
        System.out.println();
    }

    public static void main(String[] args) {


        HashMap<Integer, String> mapPersons = new HashMap<>();
        mapPersons.put(1011, "Ivan");
        mapPersons.put(1110, "Stepan");
        mapPersons.put(2110, "Svetlana");
        String name = mapPersons.get(1011);
        System.out.println(name);
        soutMap(mapPersons);
    }
}