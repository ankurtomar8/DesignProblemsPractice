package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q25_Remove_Duplicates_In_A_List {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,4,6,3,44,33,66,44,3,7,8,99,99,77,44
                ,45,63,96,37,89,89);
        List<Integer> distinctList = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Distinct Elements" + distinctList);
        // Output Distinct Elements[1, 2, 4, 6, 3, 44, 33, 66, 7, 8, 99, 77, 45, 63, 96, 37, 89]


    }
}
