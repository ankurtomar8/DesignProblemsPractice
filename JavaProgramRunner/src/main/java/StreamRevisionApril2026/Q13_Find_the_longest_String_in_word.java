package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q13_Find_the_longest_String_in_word {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Software","Engineering", "BhaiBhai",
                "KyaHai"
        );
        String longestString = words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("Longest String:"+longestString);
        // Output Longest String: Engineering

    }
}
