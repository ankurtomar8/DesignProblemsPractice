package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3_DistinctElementsInArray {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(1,2,4,6,7,8,6,5,4,7,1,71,7,2,7,13,4,2,1,2,3,34,5,4,6,6);

        List<Integer> distinctList = list.stream()
                .distinct() // finds the distinct elements
                .collect(Collectors.toList());

        System.out.println(distinctList);
        //Output [1, 2, 4, 6, 7, 8, 5, 71, 13, 3, 34]


    }
}
