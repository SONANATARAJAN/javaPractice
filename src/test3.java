public class test3 {

    private static int rowNum;

    public static void main(String args[]){

        System.out.print( getZigZax("sonanatarajan",3));
    }

    private static String getZigZax(String s,int rowNum) {
         if(s.length() ==1 || s.length() <rowNum){
             return s;
         }
         StringBuilder[] stringBuilder = new StringBuilder[rowNum];
         for(int i=0;i<rowNum;i++) {
             stringBuilder[i] = new StringBuilder();
         }
        int rowCheck = 0;
        boolean checkDown = true;
             for (char x : s.toCharArray()) {
                 stringBuilder[rowCheck].append(x);
                 if (rowCheck == 0) {
                     checkDown = true;
                 }else if(rowCheck == rowNum -1 ){
                     checkDown = false;
                 }

                 if(checkDown){
                     rowCheck ++;
                 }else {
                     rowCheck --;
                 }

             }

         StringBuilder ss = new StringBuilder();
         for(StringBuilder x:stringBuilder){
           ss.append(x);
         }
         return ss.toString();
    }
}
