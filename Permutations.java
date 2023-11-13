import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

    public static List<String> generatePermutations(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        List<String> result = new ArrayList<>();
        boolean[] used = new boolean[chars.length];
        generatePermutations(chars, used, new StringBuilder(), result);
        return result;
    }

    private static void generatePermutations(char[] arr, boolean[] used, StringBuilder current, List<String> result) {
        if (current.length() == arr.length) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (used[i] || (i > 0 && arr[i] == arr[i - 1] && !used[i - 1])) {
                continue;
            }
            used[i] = true;
            current.append(arr[i]);
            generatePermutations(arr, used, current, result);
            used[i] = false;
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(generatePermutations("a"));    // Output: [a]
        System.out.println(generatePermutations("ab"));   // Output: [ab, ba]
        System.out.println(generatePermutations("abc"));  // Output: [abc, acb, bac, bca, cab, cba]
        System.out.println(generatePermutations("aabb")); // Output: [aabb, abab, abba, baab, baba, bbaa]
    }
}
