package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q11_Find_Count_Frequency {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(
                1,2,3,7,1,4,2,3,4,8
                ,4,5,6,4,4,7,2,6,8,8
                ,1,7,5,6,7,2,39,9,9,9,7
        );

        Map<Integer,Long> frequencyMap = intList.stream()
                .collect(Collectors.groupingBy(n->n, Collectors.counting()));
        System.out.println("Frequency Map"+frequencyMap);
        //Output Frequency Map{1=3, 2=4, 3=2, 4=5, 5=2, 6=3, 39=1, 7=5, 8=3, 9=3}

        // For Each loop
        frequencyMap.forEach((k,v)-> System.out.println(k+" times "+v));
        // Output
//        1 times 3
//        2 times 4
//        3 times 2
//        4 times 5
//        5 times 2
//        6 times 3
//        39 times 1
//        7 times 5
//        8 times 3
//        9 times 3


    }
}
