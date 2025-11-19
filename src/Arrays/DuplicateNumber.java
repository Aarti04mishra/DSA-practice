package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};

        Set<Integer> seen = new HashSet<>();
        System.out.println("Duplicates:");

        for (int num : arr) {
            if (seen.contains(num)) {
                System.out.print(num + " ");
            } else {
                seen.add(num);
            }
        }
    }
}
