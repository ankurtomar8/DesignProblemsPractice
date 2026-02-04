package com.example.Revision;

public class ReverseSentenceUsingLoop {
    public static void main(String[] args) {

        String str = "I am bad developer";

        String[] strArray = str.split(" ");

        String reverseStr = "";
        for(int i = strArray.length-1;i>=0;i--){
            reverseStr = reverseStr + strArray[i] + " ";
        }
        System.out.println(reverseStr);

    }
}
