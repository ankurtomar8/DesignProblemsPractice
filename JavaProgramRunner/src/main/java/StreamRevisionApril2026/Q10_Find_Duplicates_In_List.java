package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q10_Find_Duplicates_In_List {
    public static void main(String[] args) {

        List<String> duplicateStr = Arrays.asList(
                "abc","abb","abcd","abc","bac","abcd"
        );

        Set<String> uniqueStr = new HashSet<>();
        Set<String> setNew = duplicateStr.stream()
                .filter(n-> !uniqueStr.add(n))
                .collect(Collectors.toSet());
        System.out.println(setNew);
        //Output [abc, abcd)


    }
}
