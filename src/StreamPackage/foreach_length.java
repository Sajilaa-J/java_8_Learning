package StreamPackage;

import java.util.Arrays;
import java.util.List;

public class foreach_length {
    public static void main(String[] args)
    {
        List<String> name= Arrays.asList("Sajilaa","Sanna","Priya");
       name.stream()

               .forEach(s->System.out.println(s+ " "+ s.length()));
    }
}
