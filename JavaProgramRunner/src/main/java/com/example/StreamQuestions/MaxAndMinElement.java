package com.example.StreamQuestions;

import java.util.ArrayList;
import java.util.List;

public class MaxAndMinElement {
    public static void main(String[] args) {
        int[] numArray = {3, 1, 4,
                4,5,6,9,7,4,2,3,33,66,787,11,77,445,66,};

        List<Integer> newList = new ArrayList<>();
        for(int num : numArray){
            newList.add(num);
        }

        Integer maxElement = newList.stream()
                .max(Integer::compare)
                .orElse(null);
        System.out.println(maxElement); // 787

        Integer minElement = newList.stream()
                .min(Integer::compare)
                .orElse(null);
        System.out.println(minElement); // 1

    }
}
