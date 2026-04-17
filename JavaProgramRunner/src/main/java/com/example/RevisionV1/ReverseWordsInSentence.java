package com.example.RevisionV1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInSentence {
    public static void main(String[] args) {

        String str = "I am improving my programming skills";

        List<String> words = Arrays.asList(str.split(" "));

        Collections.reverse(words);

        String reverseStr = String.join(" ", words);
        System.out.println(reverseStr);
        // Output skills programming my improving am I



    }
}
