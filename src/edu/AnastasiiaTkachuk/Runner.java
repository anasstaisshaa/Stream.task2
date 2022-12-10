package edu.AnastasiiaTkachuk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string-1");
        strings.add("string-6");
        strings.add("string-10");
        strings.add("string-90");
        strings.add("string-11");
        strings.add("string-50");
        strings.add("string-4");
        strings.add("string-6");

        int result = strings.stream()
                .filter(s -> s.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(result);
    }
}
