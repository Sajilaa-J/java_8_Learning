package Comparing_Stream_with_loop;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Convert_Stream_to_Set {
    public static void main(String[] args)
    {
        Stream<Integer> stream = Stream.of(-2, -1, 0, 1, 2);

        Set<Integer> streamSet = stream.collect(Collectors.toSet());

        streamSet.forEach(num -> System.out.println(num));
    }
}
