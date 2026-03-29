package com.example.IntermediateOne;

import java.util.Arrays;

public class Find_Sum_of_Q_Queries_Array {
    public static void main(String[] args) {

        // build prefix sum array
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            prefixSum[i] = prefixSum[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(prefixSum));
        // find sum of q queries);

        // 2. Find sum of Q queries
        // Store your queries in a 2D array: {start, end}
        int[][] queries = {
                {2, 7},  // Query 1
                {0, 4},  // Query 2
                {1, 3},  // Query 3
                {5, 8},  // Query 4
                {0, 8}   // Query 5
        };
        int q = queries.length;
        int sum = 0;
        for(int i=0;i<q;i++){
            // Extract the start and end for the CURRENT query
            int start = queries[i][0];
            int end = queries[i][1];

            if(start == 0){
                sum=prefixSum[end];
            }else{
                sum = prefixSum[end]-prefixSum[start-1];
            }
            // Print the result INSIDE the loop so you see the answer for each query
            System.out.println("Sum from index " + start + " to " + end + " = " + sum);
        }
      //  System.out.println(sum);
        // Output
//        Sum from index 2 to 7 = 330
//        Sum from index 0 to 4 = 150
//        Sum from index 1 to 3 = 90
//        Sum from index 5 to 8 = 300
//        Sum from index 0 to 8 = 450
    }
}
