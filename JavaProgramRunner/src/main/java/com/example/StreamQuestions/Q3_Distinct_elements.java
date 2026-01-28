package com.example.StreamQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3_Distinct_elements {
    public static void main(String[] args) {
        int[] numArray = {
          2,3,2,2,3,2,3,3,6,4,4,4,5,5,5,5,5,6,6,6,6,8,7,8,9,5,4,9,9,8,8,8,7,7,7
        };

        List<Integer> distinctList = Arrays.stream(numArray)
                .boxed()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctList);
        // [2, 3, 6, 4, 5, 8, 7, 9]


    }
}
