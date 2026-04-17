package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.List;

public class Q12_Concatenation_mulitple_string_words {
    public static void main(String[] args) {

        List<String> strList = Arrays.asList(
                "Hi", " I am Ankur" , "Learning New to code","Do practice"
        );

        // Logic
        // s1 = s1+""+s2
        // (s1,s2) -> s1+s2

        String str = strList.stream()
             //   .reduce("",String::concat);
                     .reduce("",(s1,s2)->s1+s2);
        System.out.println(str);
        // Output Hi I am Ankur Learning New to code Do practice


    }
}
