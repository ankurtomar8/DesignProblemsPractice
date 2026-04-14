package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q9_Find_if_any_String_Matches_in_list {
    public static void main(String[] args) {

        List<String> listStr = Arrays.asList
                ("API","LearningNewAPI","NeedtodevepNewAPI","whatiswhat");

        List<String> match = listStr.stream()
                .filter(str->str.contains("API"))
                .collect(Collectors.toList());
        System.out.println(match);
        //Output [API, LearningNewAPI, NeedtodevepNewAPI]

        String convert = String.join(",",match);
        System.out.println(convert);
        //Output API,LearningNewAPI,NeedtodevepNewAPI


    }
}
