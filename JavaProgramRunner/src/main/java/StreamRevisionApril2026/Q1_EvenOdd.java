package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1_EvenOdd {
    public static void main(String[] args) {

        List<Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

        List<Integer> evenList = arrList
                .stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even List:"+evenList);
        // Output Even List:[2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

        List<Integer> oddList = arrList
                .stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Odd List:"+oddList);
        // Output Odd List:[1, 3, 5, 7, 9, 11, 13, 15, 17, 19]

    }
}
