package StreamRevisionJuly2026;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Q1_EvenOdd {
    public static void main(String[] args) {

        List<Integer> numberList =  Arrays.asList(
                1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
        );

        List<Integer> evenList = numberList.stream()
                .filter(n ->n % 2 == 0 )
                .collect(Collectors.toList());

        System.out.println("Even List"+evenList);

        List<Integer> oddList = numberList.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Odd List" + oddList);

    }
}
