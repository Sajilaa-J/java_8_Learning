package StreamPackage;


import java.util.Arrays;
import java.util.List;

public class primeno {
    public static void main(String[] args)
    {
        List<Integer>  num= Arrays.asList(2,3,4,5,6,78,9,445,56);

        num.stream()
                .filter(n->{if (n <= 1) return false;
                                                        for (int i = 2; i <= Math.sqrt(n); i++) {
                                                            if (n % i == 0) return false;
                                                        }
                    return true;
                })
                .forEach(System.out::println);


                }

    }

