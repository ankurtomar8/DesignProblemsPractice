package com.example.StreamQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_Array_Elements {
    public static void main(String[] args) {
        int[] numArray = {3, 1, 4,
                4,5,6,9,7,4,2,3,33,66,787,11,77,445,66,};

        List<Integer> numListConverted = Arrays.stream(numArray)
                .boxed().sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        System.out.println(numListConverted);
        // [1, 2, 3, 3, 4, 4, 4, 5, 6, 7, 9, 11, 33, 66, 66, 77, 445, 787]
    }
}
