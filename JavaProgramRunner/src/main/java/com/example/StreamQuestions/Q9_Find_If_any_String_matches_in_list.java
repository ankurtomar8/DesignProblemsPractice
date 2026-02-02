package com.example.StreamQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q9_Find_If_any_String_matches_in_list {
    public static void main(String[] args) {

        String str = "Software Engineering Development Hardware";

        List<String> strSplit = Arrays.asList(str.split(" "));

        List<String> matchList = strSplit.stream()
                .filter(s -> s.contains("Hardware"))
                .collect(Collectors.toList());

        System.out.println(matchList);
        // [Hardware]

    }
}
