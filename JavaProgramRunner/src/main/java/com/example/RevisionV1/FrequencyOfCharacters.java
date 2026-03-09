package com.example.RevisionV1;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        char[] arr = {'a','a','a','a','b','b','b','b','c','c','c','c','c','d','d','d'};

        Map<Character,Integer> frequencyMap = new HashMap<>();

        for(char c : arr) {
            if(frequencyMap.containsKey(c)) {
                frequencyMap.put(c,frequencyMap.get(c)+1);
        }else{
            frequencyMap.put(c,1);
        }
        }
        System.out.println(frequencyMap);
        //Output: {a=4, b=4, c=5, d=3}


    }
}
