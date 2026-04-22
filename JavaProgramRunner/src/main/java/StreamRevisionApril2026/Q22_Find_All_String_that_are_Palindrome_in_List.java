package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q22_Find_All_String_that_are_Palindrome_in_List {
    public static void main(String[] args) {

        List<String> listStr = Arrays.asList(
                "Java","aman","naman","nitin","kakkak","level"
                ,"HelloWorld","Hello"
        );
        System.out.println("Original List "+listStr);

        List<String> palindromeList = listStr.stream()
                .filter(word->word.contentEquals
                        (new StringBuilder(word).reverse()))
                .collect(Collectors.toList());
        System.out.println("Palindrome List "+palindromeList);
        // Output

    }
}
