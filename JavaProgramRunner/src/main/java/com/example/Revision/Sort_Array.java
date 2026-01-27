package com.example.Revision;

import java.util.Arrays;

public class Sort_Array {
    public static void main(String[] args) {
        int[] numArray = {3, 1, 4,
        4,5,6,9,7,4,2,3,33,66,787,11,77,445,66,};

        Arrays.stream(numArray).sorted();
        System.out.println(Arrays.toString(numArray));
        // [3, 1, 4, 4, 5, 6, 9, 7, 4, 2, 3, 33, 66, 787, 11, 77, 445, 66]

    }
}
