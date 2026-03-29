package com.example.IntermediateOne;

import java.util.Arrays;

public class BuildPrefixSumArray {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70,80,90};
        int[] prefixSum = new int[arr.length]; // always run till length

        int sum = 0;
        prefixSum[0] = arr[0];
        // building prefix sum array
        for (int i=1; i<arr.length;i++){
            prefixSum[i] = prefixSum[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(prefixSum));
    }
}
