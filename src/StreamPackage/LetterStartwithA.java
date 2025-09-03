package StreamPackage;

import java.util.Arrays;
import java.util.List;

public class LetterStartwithA
{
    public static void main(String[] args)
    {
        List<String> name= Arrays.asList("Saji","Prasanna","Priya");
        name.stream()
                .map(String::toLowerCase)
                .filter(s->s.startsWith("p"))
                .forEach(System.out::println);
    }
}
