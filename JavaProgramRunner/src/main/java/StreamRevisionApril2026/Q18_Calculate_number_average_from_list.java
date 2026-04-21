package StreamRevisionApril2026;

import java.util.Arrays;
import java.util.List;

public class Q18_Calculate_number_average_from_list {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        double average = numbers
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println(average);
        // Output : 5.0

    }
}
