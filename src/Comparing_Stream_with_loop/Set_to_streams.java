package Comparing_Stream_with_loop;

//import java_8_versions_Learning.Stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Set_to_streams {
    public static void main(String[] args)
    {
        Set<Integer> set=new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(8);
        set.add(10);
        set.add(12);
        Stream<Integer> str=set.stream();
        str.forEach(e->System.out.print(e+" "));
    }
}
