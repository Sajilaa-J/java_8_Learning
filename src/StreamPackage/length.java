package StreamPackage;

import java.util.Arrays;
import java.util.List;

public class length {
    public static void main(String[] args)
    {
        List<String> name= Arrays.asList("Sajilaa","Sanna","Priya");
        name.stream()
                .map(String::length)
                .forEach(System.out::println);
             //  name .forEach(s->System.out.println(s+ " "+ s.length()));
    }
}
