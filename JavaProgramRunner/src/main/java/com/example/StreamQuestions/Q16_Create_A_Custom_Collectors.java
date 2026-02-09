package com.example.StreamQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q16_Create_A_Custom_Collectors {
    public static void main(String[] args) {
        String str = "Software Engineering Development Hardware";

        List<String> strSplit = Arrays.asList(str.split(" "));

        String joined = strSplit.stream()
                .collect(Collectors.joining(", "));

        System.out.println(joined); // Software Engineering Development Hardware

    }
}
