package com.example.Revision;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        char[] charArray = {'a','a','a','a','b','b','b','b','c','c','c','c','c'
                ,'d','d','d','e','e','e'};

        Set<Character> duplicateSet = new HashSet<>();
        for (Character ch : charArray) {
            if (duplicateSet.contains(ch)) {

            }else {
                duplicateSet.add(ch);
            }
        }
        System.out.println(duplicateSet);
    }
}
