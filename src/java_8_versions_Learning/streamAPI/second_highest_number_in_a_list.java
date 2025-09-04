package java_8_versions_Learning.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class second_highest_number_in_a_list {
    public static void main(String[] args)
    {
        List<Integer> list= Arrays.asList(23,89,45,75,34,21);
      int  result=  list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(result);


    }
}
