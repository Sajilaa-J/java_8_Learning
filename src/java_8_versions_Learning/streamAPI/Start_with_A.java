package java_8_versions_Learning.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Start_with_A {
    public static void main(String[] args)
    {
        List<String> list= Arrays.asList("saji","priya","prasanna","princy");
       long result= list.stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("P"))
                .count();

        System.out.println(result);

    }
}
