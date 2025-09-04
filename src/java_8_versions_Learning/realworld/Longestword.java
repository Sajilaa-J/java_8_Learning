package java_8_versions_Learning.realworld;

import java.util.*;


public class Longestword {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Programming", "Stream", "Lambda", "Expressions");

        String longest = words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        System.out.println("Longest Word: " + longest);
    }
}
