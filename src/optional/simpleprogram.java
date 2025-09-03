package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class simpleprogram {
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Prasanna", "Sajilaa", "Arun");

        Optional<String> result = names.stream()
                .filter(n -> n.startsWith("S"))
                .findFirst();

        System.out.println(result.orElse("Not Found"));
    }
}
