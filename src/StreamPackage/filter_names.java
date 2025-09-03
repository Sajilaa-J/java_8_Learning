package StreamPackage;

import java.util.Arrays;
import java.util.List;

public class filter_names {
    public static void main(String[] args)
    {
        List<String> name= Arrays.asList("Saji","Prasanna","Priya");
        name.stream()
                .filter(n->n.length()>5)
                .forEach(System.out::println);
    }

}
