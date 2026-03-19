import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class test1 {
    public static void main(String[] args) {
        String s = "sasdakffnl";
        int longest = 0;
        String stringLong = null;
        int n = s.toCharArray().length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String sub = s.substring(i, j + 1);
                System.out.println(sub);
                Set<Character> removeDuplicates = new HashSet<>();
                for (char x : sub.toCharArray()) {
                    removeDuplicates.add(x);
                }
                if (removeDuplicates.size() == sub.length()) {
                    if (sub.length() > longest) {
                        longest = sub.length();
                        stringLong = sub;
                        System.out.println("Hash set : " + removeDuplicates);
                    }
                }
            }
        }
        System.out.println("Longest String : " + stringLong);
    }
}