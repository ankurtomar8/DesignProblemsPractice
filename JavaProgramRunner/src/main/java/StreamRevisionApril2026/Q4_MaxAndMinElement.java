package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.List;

public class Q4_MaxAndMinElement {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(1,2,4,6,7,8,6,5,4,741,1,71,7,2,7,13,4,2,1,2,3,34,5,4,6,6);

        Integer maxElement = list.stream()
                .max(Integer::compare)
                .orElse(null);
        System.out.println("Max Element:"+maxElement);
        //Output Max Element:741


        Integer minElement = list.stream()
                .min(Integer::compare)
                .orElse(null);
        System.out.println("Min Element:"+minElement);
        // Output Min Element:1


    }
}
