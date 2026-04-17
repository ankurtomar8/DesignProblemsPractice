package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q16_Create_a_custom_collectors {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Artificial","Intelligence",
                "Engineering","Learning");

    String joined = list.stream().collect(Collectors.joining(" "));
        System.out.println(joined);
        //Output Artificial Intelligence Engineering Learning

    }
}
