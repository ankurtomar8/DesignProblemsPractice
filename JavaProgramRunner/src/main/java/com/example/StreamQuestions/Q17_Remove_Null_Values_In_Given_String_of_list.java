package com.example.StreamQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q17_Remove_Null_Values_In_Given_String_of_list {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Software", null, "Engineering", null, "Development", null, "Hardware");

        List<String> filteredList = strList.stream()
                .filter(s -> s != null)
                .collect(Collectors.toList());
        System.out.println(filteredList);
        // [Software, Engineering, Development, Hardware]

    }
}
