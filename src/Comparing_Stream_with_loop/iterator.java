package Comparing_Stream_with_loop;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class iterator {
    public static  void main (String[] args)
    {
        Iterable<String> iterable = Arrays.asList("Prasanna", "Sajilaa", "Arun", "Meera");
        Stream<String> stream = StreamSupport.stream(iterable.spliterator(), false);

        stream.filter(name -> name.length() > 5)
                .forEach(System.out::println);
    }
}
