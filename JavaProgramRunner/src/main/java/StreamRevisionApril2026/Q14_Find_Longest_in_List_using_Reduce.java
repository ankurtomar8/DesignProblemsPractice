package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.List;

public class Q14_Find_Longest_in_List_using_Reduce {
    public static void main(String[] args) {
        List<String> listStr = Arrays.asList("Software","Hardware"
                ,"ManagerBkc","NewWordsEngineering"
        );
    // logic s1.length > s2.length

        String longestString = listStr.stream()
                .reduce("",(s1,s2)->s1.length()>s2.length()?s1:s2);
        System.out.println("Longest String:"+longestString);
        //Output Longest String: NewWordsEngineering

    }
}
