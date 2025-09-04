package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Start_with_s_in_optional {
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Prasanna", "Arun", "Sajilaa", "Meena", "Santhosh");

        Optional<String> result = names.stream()
                .filter(n -> n.startsWith("S"))
                .findFirst();

        System.out.println(result.orElse("not found"));
    }
}
