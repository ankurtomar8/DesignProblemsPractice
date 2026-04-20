package com.example.Revision;

public class ReverseLettersInString {
    public static void main(String[] args) {
        String str = "Ankur Bhai Bhai";

        String strRev = "";

        for(int i=0;i <= str.length()-1; i++){
            strRev = str.charAt(i)+strRev;
        }
        System.out.println(strRev);

    }

}
