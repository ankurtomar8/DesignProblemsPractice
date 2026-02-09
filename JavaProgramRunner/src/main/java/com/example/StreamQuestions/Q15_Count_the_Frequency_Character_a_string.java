package com.example.StreamQuestions;

import java.util.Map;
import java.util.stream.Collectors;

public class Q15_Count_the_Frequency_Character_a_string {
    public static void main(String[] args) {

        String str = "Bookkeeper";

        Map<Character,Long> frequencyMap = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        System.out.println(frequencyMap);
        // {B=1, o=2, k=2, e=2, p=2, r=1})

    }
}
