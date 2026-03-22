import java.util.*;

public class test2 {
    public static void main(String args[]) {
        String s = "ssss";
//        s.split("");
//        System.out.println(s);
//        String dummy = "";
//        Set<Character> duplicate = new HashSet<>();
//
//        for (char x : s.toCharArray()) {
//            if (duplicate.contains(x)) {
//                System.out.println(x);
//                dummy += x;
//            }
//            duplicate.add(x);

        Set<Character> seen = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();

        for(char x : s.toCharArray()) {
            if (!seen.add(x)) {
                duplicate.add(x);

            }

        }
//        System.out.println("duplicate char ::: " + dummy);
        System.out.println(duplicate);
    }}

