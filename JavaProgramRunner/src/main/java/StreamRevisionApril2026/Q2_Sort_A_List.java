package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q2_Sort_A_List {
    public static void main(String[] args) {

        List<Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,
                                                12,13,14,15,16,17,18,19,20);

        List<Integer> sortedList = arrList
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("ReverseSorted List:"+sortedList);
        //Output ReverseSorted List:[20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5,
        // 4, 3, 2, 1]


    }
}
