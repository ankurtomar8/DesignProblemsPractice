package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q19_Convert_List_of_Strings_Into_Map {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Java", "collection", "learning", "is", "fun");

        Map<Integer, String> wordMap = words.stream()
                .collect(Collectors.toMap(String::length,word->word));

        System.out.println(wordMap);
        //{2=is, 3=fun, 4=Java, 8=learning, 10=collection}

    }
}
