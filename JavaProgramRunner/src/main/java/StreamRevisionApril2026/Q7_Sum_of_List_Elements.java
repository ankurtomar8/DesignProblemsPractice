package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.List;

public class Q7_Sum_of_List_Elements {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Integer sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of List Elements:"+sum);
        //Output Sum of List Elements:55

    }
}
