package java_8_versions_Learning;


import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args){
        List<Integer> num= Arrays.asList(2,3,4,5,6,7,8,9,35,56);

        num.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);
    }


}
