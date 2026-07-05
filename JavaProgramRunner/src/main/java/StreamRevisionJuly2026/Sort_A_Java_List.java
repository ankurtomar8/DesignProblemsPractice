package StreamRevisionJuly2026;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_A_Java_List {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(
                10,0,12,45,74,14,15,6,78,98,65,25,53,31,24,12,13,
                15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30
        );

        List<Integer> sortedList = numberList
                .stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted List: " + sortedList);
        // Output
        //Sorted List: [0, 6, 10, 12, 12, 13, 14, 15, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 24,
        // 25, 25, 26, 27, 28, 29, 30, 31, 45, 53, 65, 74, 78, 98]

    }
}
