package StreamPackage;

import java.util.Arrays;
import java.util.List;

public class cube {
    public static void main(String[] args)
    {
        List<Integer> num= Arrays.asList(3,4,55,6,6,76);
        num.stream()
                .map(n->n*n*n)
                .forEach(System.out::println);
    }
}
