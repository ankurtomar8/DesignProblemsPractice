package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q20_Filter_List_Even_Odd_By_Partition {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(
                1,2,3,4,5,6,7,8,9
        );
        System.out.println("Original List \n "+list);

        Map<Boolean,List<Integer>> map = list.stream()
        .collect(Collectors.partitioningBy(i->i%2==0));

        System.out.println("Partitioning by even numbers"+map);
        // Output Partitioning by even numbers{false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8]}


    }
}
