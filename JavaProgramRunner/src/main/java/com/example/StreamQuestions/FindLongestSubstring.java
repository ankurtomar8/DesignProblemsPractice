package com.example.StreamQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestSubstring {
    public static void main(String[] args) {
           List<String> words = Arrays.asList("Java", "collection best in world don't know why",
                   "Very PowerFul Language");


           String longestWord = words.stream()
                   .max(Comparator.comparingInt(String::length))
                   .orElse("");

           System.out.println(longestWord);
           // collection best in world don't know why


    }
}
