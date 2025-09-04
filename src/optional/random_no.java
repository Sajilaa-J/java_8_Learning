package optional;

import java.util.Optional;

public class random_no {
    public static  void main(String[] args)
    {
        String name=null;
        Optional<String> optionalName = Optional.ofNullable(name);
        String result = optionalName.orElse("Default Name");
        System.out.println("Name: " + result);
    }
}
