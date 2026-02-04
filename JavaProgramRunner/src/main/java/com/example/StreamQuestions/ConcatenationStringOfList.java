package com.example.StreamQuestions;

import java.util.Arrays;
import java.util.List;

public class ConcatenationStringOfList {
    public static void main(String[] args) {

        List<String>  words = Arrays.asList("Java","collection","Very PowerFul Language");

      String concatented = words.stream()
                .reduce("",(s1,s2) -> s1+" "+s2).trim();
        // .reduce("",(s1,s2)->s1+" "+s2).trim();
        System.out.println(concatented);
        // Java collection Very PowerFul Language

    }
}
