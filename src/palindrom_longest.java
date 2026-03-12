public class palindrom_longest {
    public static void main(String[] args) {
        String s = "abbar";
        String longest = "";
        int n = s.toCharArray().length;
        System.out.println(s.toCharArray().length);
        s.split("");

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String getArrays = s.substring(i, j + 1);
                StringBuffer stringBuffer = new StringBuffer(getArrays);


                if (getArrays.equals(stringBuffer.reverse().toString())) {
                    if (getArrays.length() > longest.length()) {
                         longest = getArrays;
                    }

                }


            }
        }
        System.out.println("good " + longest);
        System.out.println("good " + longest);

    }
}
