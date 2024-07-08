import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class Practice2 {

    public static void main(String[] args) {
        
        int[] a= {10,11,45,23,12,45};
        
        int[] output=processTheInput(a);
        
        for(int ou:output) {
            System.out.print(ou +" ");
 
        }
        

    }

    private static int[] processTheInput(int[] a) {
    
         ArrayList<Integer> oddPlace=new ArrayList<Integer>();
         ArrayList<Integer> evenPlace=new ArrayList<Integer>();
         
         for(int i=0;i< a.length;i++) {
             if(i%2 ==0) {
                 oddPlace.add(a[i]);
             }else {
                 evenPlace.add(a[i]);
             }
         }
         
         System.out.println(oddPlace);
         System.out.println(evenPlace);
         
         Collections.sort(oddPlace,Collections.reverseOrder());
         
         Collections.sort(evenPlace);
         
         int[] out=new int[a.length];
         int oddI=0;
         int evenI=0;
         
          for(int i=0;i<a.length;i++) {
              if(i%2 ==0) {
                  out[i]=oddPlace.get(oddI++);
              }else {
                  out[i]=evenPlace.get(evenI++);

              }
              
          }

        return out;
    }

}
