package StreamPackage;

import java.util.Arrays;
import java.util.List;

public class printall {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Saji", "Prasanna", "Priya");
        name.stream()
                .forEach(System.out::println);
    }
}
