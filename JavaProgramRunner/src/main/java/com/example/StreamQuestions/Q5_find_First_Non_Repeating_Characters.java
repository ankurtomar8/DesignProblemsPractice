package com.example.StreamQuestions;

import java.util.Optional;

public class Q5_find_First_Non_Repeating_Characters {
    public static void main(String[] args) {

        String str = "BBookkeeper";

        Optional<Character> firstNonRepeatingChar = str.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                .findFirst();

        System.out.println("Last Non Repeating Character is :"+firstNonRepeatingChar);
        // Last Non Repeating Character is :Optional[p]

    }
}
