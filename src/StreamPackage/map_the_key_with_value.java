package StreamPackage;

import java.util.HashMap;
import java.util.Map;

public class map_the_key_with_value {
    public static void main(String[] args)
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Mango");

        map.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
}
