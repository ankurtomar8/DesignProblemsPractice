package com.example.Revision;

import java.util.Arrays;

public class ReversetheArray {
    public static void main(String[] args) {

        int[] numArray = {1,2,3,4,5,6,7,8,9};

        int start = 0;
        int end = numArray.length-1;

        while(start < end) {
            int temp = numArray[start];
            numArray[start] = numArray[end];
            numArray[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(numArray));

    }
}
