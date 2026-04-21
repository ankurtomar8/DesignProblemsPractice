package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q21_Find_Nth_Largest_Element {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(
                10,20,30,40,60
        );
        // n == 3
        System.out.println("Original List " +list);

        Integer nthLargest = list.stream()
        .sorted(Comparator.reverseOrder())
        .skip(2)
                .findFirst()
        .orElseThrow(()->new IllegalArgumentException("Invalid input"));
        System.out.println("3rd largest element is "+nthLargest);
        // Output 3rd largest element is 30


    }
}
