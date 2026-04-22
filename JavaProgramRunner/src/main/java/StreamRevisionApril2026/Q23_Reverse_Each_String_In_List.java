package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q23_Reverse_Each_String_In_List {
    public static void main(String[] args) {

        List<String> listStr = Arrays.asList(
                "Java","aman","naman","nitin","kakkak","level"
                ,"HelloWorld","Hello"
        );
        System.out.println(" Original List" + listStr);

        List<String> listRev = listStr
                .stream()
                .map(word-> new StringBuilder(word).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(" Reverse List" + listRev);

        // Output
//        Original List[Java, aman, naman, nitin, kakkak, level, HelloWorld, Hello]
//        Reverse List[avaJ, nama, naman, nitin, kakkak, level, dlroWolleH, olleH]

    }
}
