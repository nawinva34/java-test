import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {

    public static int findOddOccurrence(int[] array) {
        Map<Integer, Integer> occurrenceMap = new HashMap<>();

        for (int num : array) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }

        for (int num : occurrenceMap.keySet()) {
            if (occurrenceMap.get(num) % 2 != 0) {
                return num;
            }
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        System.out.println(findOddOccurrence(new int[]{7}));                                     // Output: 7
        System.out.println(findOddOccurrence(new int[]{0}));                                     // Output: 0
        System.out.println(findOddOccurrence(new int[]{1, 1, 2}));                               // Output: 2
        System.out.println(findOddOccurrence(new int[]{0, 1, 0, 1, 0}));                         // Output: 0
        System.out.println(findOddOccurrence(new int[]{1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1})); // Output: 4
    }
}
