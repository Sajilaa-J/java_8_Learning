package Comparing_Stream_with_loop;

import java.util.stream.Stream;

public class Reduceconcept {
    public static void main(String[]  args)
    {
        double total= Stream.of(2.2,4.4,5.5,6.6)
                .reduce(0.0,(Double a,Double b)->a+b);
        System.out.println(total);
    }
}
