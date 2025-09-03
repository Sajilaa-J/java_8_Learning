package Comparing_Stream_with_loop;

import java.util.stream.IntStream;

public class Integer_Stream {
    public static void main(String[] args) {
        System.out.println("Integer Stream : ");
        IntStream.range(1, 10)
                .forEach(System.out::print);

        System.out.println();
        System.out.println("Integer Stream with skip : ");
        IntStream.range(3,20)
                .skip(3)
                .forEach(System.out::print);
        System.out.println();
        System.out.println("Integer Stream with sum : ");
        System.out.println(IntStream.range(1,5).sum());
    }
}
