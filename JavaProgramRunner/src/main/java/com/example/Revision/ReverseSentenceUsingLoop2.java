package com.example.Revision;

public class ReverseSentenceUsingLoop2 {
    public static void main(String[] args) {

        String str = "I am bad developer";

        String[] strReverse = str.split(" ");

        String reverseStr = "";

        for(int i=strReverse.length-1; i >= 0; i-- ){
            reverseStr = reverseStr + strReverse[i] + " ";
        }

        System.out.println(reverseStr);

    }
}
