import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {

    String s= "abcddcbasonam";
    int maxLength = 0;
    int left = 0;
        Map<Character,Integer> map = new HashMap<>();
    for(int right= 0 ; right < s.length();right ++){
        char currentFrame = s.charAt(right);
        System.out.println("===========================================");
        System.out.println("==== "+(right ) + " : " +currentFrame +"====");

        if(map.containsKey(currentFrame)){
            System.out.println("Duplicate");
            System.out.println(left +", "+  map.get(currentFrame) +" + 1" );
            left = Math.max(left , map.get(currentFrame) + 1);
            System.out.println("left : "+  left );
        }
        System.out.println("ADD Element");
        System.out.println("Math.max( "+ maxLength + ",( "+ right + " - " + left + " + 1 ))");
        map.put(currentFrame , right);
        maxLength = Math.max(maxLength , (right - left + 1));
          System.out.println("max leghth : "+ maxLength);
        System.out.println("=========================================");

    }
        System.out.println(map);
        System.out.println("Max Length : "+maxLength);

    }
}
