package com.example.StreamQuestions;

import java.util.Arrays;
import java.util.List;

public class Q18_Calculate_Number_Average_From_List {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double average = numList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Average is :"+average);
        // Average is :5.5

    }
}
