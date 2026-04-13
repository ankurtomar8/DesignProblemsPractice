package StreamRevisionApril2026;

import java.util.Optional;
import java.util.stream.Collectors;

public class Q5_Find_Non_Repeated_Characters {
    public static void main(String[] args) {

        String str = "zzookkeeper";

        Optional<Character> nonRepeatedChar = str.chars()
                .mapToObj(c -> (char) c)
                .filter(ch-> str.indexOf(ch)==str.lastIndexOf(ch))
                .findFirst();
        System.out.println(" Lasted Non Repeated Character: "+nonRepeatedChar.get());
        // Output  Lasted Non Repeated Character:p
    }
}
