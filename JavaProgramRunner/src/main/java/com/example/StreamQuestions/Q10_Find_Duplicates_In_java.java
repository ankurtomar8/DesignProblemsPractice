package com.example.StreamQuestions;

import java.util.HashSet;
import java.util.Set;

public class Q10_Find_Duplicates_In_java {
    public static void main(String[] args) {

        int[] numArray = {3, 1, 4,2 ,5,4,8,9,6,3,6,9,4,1,2,3,6};

        Set<Integer> duplicateSet = new HashSet<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : numArray) {
            if (seen.add(num)) {
                seen.add(num);
        }else {
                duplicateSet.add(num);
            }
        }

        System.out.println(duplicateSet);

    }
}
