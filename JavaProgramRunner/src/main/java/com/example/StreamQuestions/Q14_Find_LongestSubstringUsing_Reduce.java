package com.example.StreamQuestions;

import java.util.Arrays;
import java.util.List;

public class Q14_Find_LongestSubstringUsing_Reduce {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java", "collection best in world don't know why",
                "Very PowerFul Language");

        String LongestWord = words.stream()
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2)
                 .orElse("");

        System.out.println(LongestWord);
        // collection best in world don't know why

    }
}
