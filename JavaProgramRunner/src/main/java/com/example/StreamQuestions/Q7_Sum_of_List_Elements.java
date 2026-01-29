package com.example.StreamQuestions;

import java.util.Arrays;
import java.util.List;

public class Q7_Sum_of_List_Elements {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sum = numList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of List Elements is : "+sum);
        // Sum of List Elements is : 55


    }
}
