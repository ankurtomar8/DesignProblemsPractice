package com.example.Revision;

public class Find_Element_which_has_atleast_greater_than_itself {
    public static void main(String[] args) {

        int[] arr = {2,5,1,4,8,0,8,1,3,8};
        int max = Integer.MIN_VALUE;
        int counter = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                counter = 1;
            }
            else if(arr[i] == max){
             counter++;
            }
        }
        System.out.println(counter); // 3
        System.out.println(arr.length-counter); // 7

    }
}
