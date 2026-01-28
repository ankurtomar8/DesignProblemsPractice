package com.example.StreamQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1_Even_Odd {
    public static void main(String[] args) {
        int[] numArray = {3,45,6,74,7,86,93,4,1,52,3,6,9,74,25,3,25,71,75,23,27,45,15,22 };


        List<Integer> evenList = Arrays.stream(numArray)
                .boxed()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenList);
        // [6, 74, 86, 4, 52, 6, 74, 22]

        List<Integer> oddList = Arrays.stream(numArray)
                .boxed()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(oddList);
        // [3, 45, 7, 93, 1, 3, 9, 25, 3, 25, 71, 75, 23, 27, 45, 15]



    }
}
