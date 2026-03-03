import java.util.HashMap;
import java.util.HashSet;

public class sumArrays {



        public static void main(String[] args){

            int[] num = {2,7,11,15};
            int targets = 17;


           /* int store ;
            for(int i=0 ; i<num.length ; i++){
              for(int j=i+1; j<num.length ; j++){

                  store = num[i] + num[j];
                  if(store == targets){
                      System.out.println("good : "+ num[i] +" + "+num[j] +"  :  "+store );
                      System.out.println(("indice" + i +"," +j));
                      return;
                  }else{
                      System.out.println("Not good : "+ num[i] +" + "+num[j] +"  :  "+store );
                  }

              }

            }*/
            HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<num.length;i++){

            int nature = targets - num[i];

            if(map.containsKey(nature)){
                System.out.println(map.get(nature)+","+i + " "+nature+" : "+ num[i]);
            }
            map.put(num[i],i);
        }
        }

}
