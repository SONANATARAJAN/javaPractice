import java.util.HashSet;


public class Main {
    public static boolean hasAllCodes(String s, int k) {
        int n = s.length();
        if (n - k + 1 < (1 << k)) {
            return false;
        }
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i <= n - k; i++) {
            String sub = s.substring(i, i + k);
            set.add(sub);

        }

        return set.size() == ((1 << k)) ;

    }


    public static void main(String[] args) {
            String ss= "1110";
        System.out.println( hasAllCodes(ss,1));
    }

}


