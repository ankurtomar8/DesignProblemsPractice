package com.example.Revision;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInSentence {
    public static void main(String[] args) {

        String str = "I am bad developer";

        List<String> listStr = Arrays.asList(str.split(" "));

        Collections.reverse(listStr);

        String reverseStr = String.join(" ", listStr);
        System.out.println(reverseStr);

    }
}
