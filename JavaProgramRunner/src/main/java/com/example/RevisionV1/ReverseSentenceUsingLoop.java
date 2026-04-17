package com.example.RevisionV1;

public class ReverseSentenceUsingLoop {
    public static void main(String[] args) {

        String Str = "Becoming a developer";

        String[] strArr = Str.split(" ");

        String reverseStr = "";

        for(int i=strArr.length-1; i>=0 ; i--){
            reverseStr = reverseStr + strArr[i]+ " ";
        }
        System.out.println(reverseStr);
        // Output developer a Becoming


    }
}
