package java_8_versions_Learning.lamda;

import java.util.Arrays;
import java.util.List;

public class sort_Length {
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Prasanna", "Arun", "Sajilaa", "Meena", "Santhosh");

        names.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(names);
    }
}
