import java.util.ArrayList;
import java.util.List;

public class countSmileys {

    public static int countSmy(String[] arr) {
        List<String> smileys = new ArrayList<>();

        for (String s : arr) {
            if (s.length() == 2 && (s.charAt(0) == ':' || s.charAt(0) == ';') && (s.charAt(1) == ')' || s.charAt(1) == 'D')) {
                smileys.add(s);
            } else if (s.length() == 3 && (s.charAt(0) == ':' || s.charAt(0) == ';') && (s.charAt(1) == '-' || s.charAt(1) == '~') && (s.charAt(2) == ')' || s.charAt(2) == 'D')) {
                smileys.add(s);
            }
        }

        return smileys.size();
    }

    public static void main(String[] args) {
        String[] test1 = {":)", ";(", ";}", ":-D"};
        String[] test2 = {";D", ":-(", ":-)", ";~)"};
        String[] test3 = {";]", ":[", ";*", ":$", ";-D"};

        System.out.println(countSmy(test1)); // Output: 2
        System.out.println(countSmy(test2)); // Output: 3
        System.out.println(countSmy(test3)); // Output: 1
    }
}
