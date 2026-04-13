package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q6_1_ConvertListWordstoUpperAndLower_Case {
    public static void main(String[] args) {

        List<String> listStr = Arrays.asList("ApPle", "BaNaNa", "CheRry", "DaTe");

        List<String> StringLowerCase = listStr.stream()
        .map(String::toLowerCase)
        .collect(Collectors.toList());
        System.out.println("Lower Case"+StringLowerCase);
        //Output Lower Case[apple, banana, cherry, date]

        List<String> StringUpperCase = listStr.stream()
                .map(String::toUpperCase)
        .collect(Collectors.toList());
        System.out.println("Upper Case"+StringUpperCase);
        //Output Upper Case[APPLE, BANANA, CHERRY, DATE);


    }
}
