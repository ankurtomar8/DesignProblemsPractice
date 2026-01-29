package com.example.StreamQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q6_Convert_All_String_Letters_toUpperCase {
    public static void main(String[] args) {

        String str  = "Software Engineering Development Hardware";

        List<String> upperCaseList = Arrays.stream(str.split(" "))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseList);
        // [SOFTWARE, ENGINEERING, DEVELOPMENT, HARDWARE)

        List<String> lowerCaseList = Arrays.stream(str.split(" "))
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(lowerCaseList);
        // [software, engineering, development, hardware]




    }
}
